package cn.com.xuxiaowei.annotation;

import cn.com.xuxiaowei.enums.DatabaseSourceEnum;

import java.lang.annotation.*;

/**
 * 数据源注解
 * <p>
 * 1、默认数据库为 Oracle
 * <p>
 * 2、在 Mapper 接口的方法上中使用：
 * <code>@DatabaseSource(DatabaseSourceEnum.MYSQL)</code>
 * 3、在 ServiceImpl 的方法上中使用：
 * <code>@DatabaseSource(DatabaseSourceEnum.MYSQL)</code>
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DatabaseSource {

    DatabaseSourceEnum value() default DatabaseSourceEnum.ORACLE;

}
