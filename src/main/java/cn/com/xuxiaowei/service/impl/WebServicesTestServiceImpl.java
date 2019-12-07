package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.service.WebServicesTestService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * WebService 测试接口实现类
 *
 * @author xuxiaowei
 */
@Service
@WebService(targetNamespace = "http://xuxiaowei.com.cn")
public class WebServicesTestServiceImpl implements WebServicesTestService {

    /**
     * WebService 测试方法
     *
     * @param username 测试参数，用户名
     * @return 测试结果
     */
    @Override
    public String hiWebService(String username) {

        String response;

        if (username == null || "".equals(username)) {
            response = "请输入用户名";
        } else {
            response = "你好：" + username;
        }

        return response;
    }

}
