package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.TestUser1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
