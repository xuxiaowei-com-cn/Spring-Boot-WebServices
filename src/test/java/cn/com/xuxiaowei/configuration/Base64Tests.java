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
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Test;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

/**
 * Base64 测试类
 *
 * @author xuxiaowei
 * @see BasicAuthenticationFilter
 * @since 0.0.1
 */
@Slf4j
class Base64Tests {

    @Test
    void encodeBase64() {
        String binaryData = "xxw:123";
        String encodeBase64 = new String(Base64.encodeBase64(binaryData.getBytes()));
        log.info(encodeBase64);
        String decodeBase64 = new String(Base64.decodeBase64(encodeBase64));
        log.info(decodeBase64);
    }

}
