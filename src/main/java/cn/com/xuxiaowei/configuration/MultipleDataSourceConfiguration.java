package cn.com.xuxiaowei.configuration;

import cn.com.xuxiaowei.enums.DatabaseSourceEnum;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 多数据源配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
public class MultipleDataSourceConfiguration {

    /**
     * MyBatis Plus 配置
     */
    private final MybatisPlusProperties mybatisPlusProperties;

    @Autowired
    public MultipleDataSourceConfiguration(MybatisPlusProperties mybatisPlusProperties) {
        this.mybatisPlusProperties = mybatisPlusProperties;
    }

    /**
     * 读取 Oracle 数据源
     */
    @Bean(name = "oracle")
    @ConfigurationProperties(prefix = "spring.datasource.oracle")
    public DataSource oracle() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 读取 MySQL 数据源
     */
    @Bean(name = "mysql")
    @ConfigurationProperties(prefix = "spring.datasource.mysql")
    public DataSource mysql() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 读取 MySQL 数据源
     */
    @Bean(name = "sqlserver")
    @ConfigurationProperties(prefix = "spring.datasource.sqlserver")
    public DataSource sqlserver() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源配置
     */
    @Bean
    @Primary
    public DataSource multipleDataSource(@Qualifier("oracle") DataSource oracle,
                                         @Qualifier("mysql") DataSource mysql,
                                         @Qualifier("sqlserver") DataSource sqlserver) {
        MultipleDataSource multipleDataSource = new MultipleDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>(4);
        targetDataSources.put(DatabaseSourceEnum.ORACLE, oracle);
        targetDataSources.put(DatabaseSourceEnum.MYSQL, mysql);
        targetDataSources.put(DatabaseSourceEnum.SQLSERVER, sqlserver);
        //添加数据源
        multipleDataSource.setTargetDataSources(targetDataSources);
        //设置默认数据源
        multipleDataSource.setDefaultTargetDataSource(oracle);
        return multipleDataSource;
    }

    /**
     * SQL 工厂
     */
    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(multipleDataSource(oracle(), mysql(), sqlserver()));

        // MyBatis Plus 配置中的 XML 读取
        String[] mapperLocations = mybatisPlusProperties.getMapperLocations();

        String locationPattern = StringUtils.join(mapperLocations, ",");

        // 读取 Mapper XML
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(locationPattern));

        MybatisConfiguration configuration = new MybatisConfiguration();

        configuration.setJdbcTypeForNull(JdbcType.NULL);
        // 分页
        configuration.addInterceptor(new MybatisPlusConfiguration().paginationInterceptor());

        configuration.setMapUnderscoreToCamelCase(true);

        sqlSessionFactory.setConfiguration(configuration);

        return sqlSessionFactory.getObject();
    }

}
