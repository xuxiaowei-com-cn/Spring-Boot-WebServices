/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.com.xuxiaowei.configuration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 密码编辑器 测试类
 */
@Slf4j
@SpringBootTest
class PasswordEncoderConfigurationTests {

    /**
     * 密码编辑器
     */
    PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    /**
     * 创建密码
     */
    @Test
    void encode() {
        String encode = passwordEncoder.encode("123");
        log.info(encode);
    }

    /**
     * 比较密码
     */
    @Test
    void matches() {
        boolean matches = passwordEncoder.matches("123", "{bcrypt}$2a$10$JPB9wWNtnYnuCnr9brCC7eyyaRnza4qMRhAUrV5rQPA7CgcOLzsEK");
        log.info(String.valueOf(matches));
    }

}
