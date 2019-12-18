package cn.com.xuxiaowei.aspect;

import cn.com.xuxiaowei.annotation.DatabaseSource;
import cn.com.xuxiaowei.configuration.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 数据库切片
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Component
@Slf4j
@Aspect
@Order(value = -1)
public class DatabaseSourceAspect {

    @Pointcut("@within(cn.com.xuxiaowei.annotation.DatabaseSource) || @annotation(cn.com.xuxiaowei.annotation.DatabaseSource)")
    public void pointCut() {

    }

    @Before("pointCut() && @annotation(dataSource)")
    public void doBefore(DatabaseSource dataSource) {
        log.info("选择数据源：" + dataSource.value().getValue());
        DataSourceContextHolder.setDataSource(dataSource.value());
    }

    @After("pointCut()")
    public void doAfter() {
        DataSourceContextHolder.clear();
    }

}
