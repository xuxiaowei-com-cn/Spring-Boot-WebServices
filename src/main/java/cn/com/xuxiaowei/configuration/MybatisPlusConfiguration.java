package cn.com.xuxiaowei.configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Mybatis Plus 配置
 * <p>
 * 扫描 Mapper 接口
 * <p>
 * 分页插件
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
@EnableTransactionManagement
@MapperScan("cn.com.xuxiaowei.mapper.**")
public class MybatisPlusConfiguration {

    /**
     * 分页插件
     */
    @Bean
    PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
