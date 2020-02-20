package cn.com.xuxiaowei.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 密码编码器
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
@Component
public class PasswordEncoderConfiguration implements PasswordEncoder {

    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    /**
     * @param rawPassword     用户发送的密码
     * @param encodedPassword 数据库的密码
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {

        // 密码编辑器
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        boolean matches;

        try {
            // 使用密码编辑器进行密码比较
            matches = passwordEncoder.matches(rawPassword, encodedPassword);

        } catch (IllegalArgumentException e) {

            // 比较密码异常（数据库密码不是 PasswordEncoderFactories 加密形式）
            matches = false;

            e.printStackTrace();
        }

        return matches;
    }

}
