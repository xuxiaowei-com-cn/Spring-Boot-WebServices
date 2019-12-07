package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.TestUser1;

/**
 * 测试 服务接口
 *
 * @author xuxiaowei
 */
public interface TestUser1Service {

    /**
     * 根据 id 查询用户
     *
     * @param id ID
     * @return 用户信息
     */
    TestUser1 selectById(String id);

}
