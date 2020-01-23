package cn.com.xuxiaowei.web.service;

import cn.com.xuxiaowei.entity.TestUser1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试 用户1 服务接口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@SpringBootTest
class TestUser1ServiceTests {

    @Autowired
    private TestUser1Service testUser1Service;

    @Test
    void selectById() {
        TestUser1 testUser1 = testUser1Service.selectById("5");
        System.out.println(testUser1);
    }

}
