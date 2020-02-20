package cn.com.xuxiaowei.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 加载 Security 属性文件
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
@Component
@ConfigurationProperties(prefix = "security")
public class SecurityProperties {

    private String loginPage;

    private String loginProcessingUrl;

    private String failureForwardUrl;

    private String defaultTargetUrl;

    private Boolean alwaysUseDefaultTargetUrl;

    private String logoutUrl;

    private String logoutSuccessUrl;

    private Integer tokenValiditySeconds;

    private String rememberMeParameter;

    private String key;

    private String accessDeniedPage;

}
