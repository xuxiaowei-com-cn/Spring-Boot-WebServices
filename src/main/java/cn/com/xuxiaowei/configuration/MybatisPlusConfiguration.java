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
 * MyBatis Plus 性能分析插件
 * <p>
 * 性能分析拦截器，用于输出每条 SQL 语句及其执行时间
 * <p>
 * SQL 格式化
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
     *
     * @see <a href="https://mp.baomidou.com/guide/performance-analysis-plugin.html#%E6%80%A7%E8%83%BD%E5%88%86%E6%9E%90%E6%8F%92%E4%BB%B6">性能分析插件</a>
     *
     * SQL执行效率插件
     * <p>
     * 设置 dev-sql 环境开启
     * <p>
     * Profile({"dev-sql"})（需要在配置文件中激活）
     */
//    @Bean
//    @Profile({"dev-sql"})
//    PerformanceInterceptor performanceInterceptor() {
//
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//
//        /* SQL 是否格式化 */
//        performanceInterceptor.setFormat(true);
//
//        return performanceInterceptor;
//    }

    /**
     * 分页插件
     */
    @Bean
    PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
