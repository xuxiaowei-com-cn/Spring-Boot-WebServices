package cn.com.xuxiaowei.client;

import cn.com.xuxiaowei.web.service.WebServicesTestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.jupiter.api.Test;

/**
 * CXF WebService 客户端
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
public class CxfClientTests {

    /**
     *
     */
    private static final String address = "http://127.0.0.1:8080/ws/testWebService?wsdl";

    /**
     *
     */
    private static final String username = "徐晓伟";

    @Test
    void jaxWsProxyFactoryBean() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress(address);
        jaxWsProxyFactoryBean.setServiceClass(WebServicesTestService.class);
        WebServicesTestService webServicesTestService = (WebServicesTestService) jaxWsProxyFactoryBean.create();
        String result = webServicesTestService.hiWebService(username);
        log.debug("返回结果：{}", result);
    }

}