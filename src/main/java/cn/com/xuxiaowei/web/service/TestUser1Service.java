package cn.com.xuxiaowei.web.service;

import cn.com.xuxiaowei.entity.TestUser1;

import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * 测试 服务接口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public interface TestUser1Service {

    /**
     * 根据 id 查询用户
     *
     * @param id ID
     * @return 用户信息
     */
    @WebMethod
    TestUser1 selectById(@WebParam(name = "id") String id);

}
