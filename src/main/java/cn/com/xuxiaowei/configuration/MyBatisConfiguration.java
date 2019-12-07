package cn.com.xuxiaowei.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis 配置
 * <p>
 * 扫描 Mapper 接口
 *
 * @author xuxiaowei
 */
@Configuration
@MapperScan("cn.com.xuxiaowei.mapper.**")
public class MyBatisConfiguration {

}
