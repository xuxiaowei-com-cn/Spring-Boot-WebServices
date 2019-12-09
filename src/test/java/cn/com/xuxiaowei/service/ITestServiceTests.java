package cn.com.xuxiaowei.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试自动生成
 */
@SpringBootTest
public class ITestServiceTests {

    @Autowired
    private ITestService testService;

    @Test
    void selectById() {
        cn.com.xuxiaowei.entity.Test byId = testService.getById(1);
        System.out.println(byId);
    }

}
