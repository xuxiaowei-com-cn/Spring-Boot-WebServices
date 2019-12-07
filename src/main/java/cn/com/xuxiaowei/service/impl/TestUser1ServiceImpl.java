package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.TestUser1;
import cn.com.xuxiaowei.mapper.TestUser1Mapper;
import cn.com.xuxiaowei.service.TestUser1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 测试 服务接口实现类
 *
 * @author xuxiaowei
 */
@Service
public class TestUser1ServiceImpl implements TestUser1Service {

    @Resource
    private TestUser1Mapper testUser1Mapper;

    @Override
    public TestUser1 selectById(String id) {
        return testUser1Mapper.selectById(id);
    }

}
