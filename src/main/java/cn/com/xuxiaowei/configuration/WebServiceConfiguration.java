package cn.com.xuxiaowei.configuration;

import cn.com.xuxiaowei.handlerinterceptor.WebServicesHandlerInterceptor;
import cn.com.xuxiaowei.web.service.TestUser1Service;
import cn.com.xuxiaowei.web.service.WebServicesTestService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * WebServices 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
public class WebServiceConfiguration {

    /**
     * WebService 测试接口
     */
    private final WebServicesTestService webServicesTestService;

    /**
     * 测试 服务接口
     */
    private final TestUser1Service testUser1Service;

    /**
     * 注入
     *
     * @param webServicesTestService WebService 测试接口
     * @param testUser1Service       测试 服务接口
     */
    @Autowired
    public WebServiceConfiguration(WebServicesTestService webServicesTestService, TestUser1Service testUser1Service) {
        this.webServicesTestService = webServicesTestService;
        this.testUser1Service = testUser1Service;
    }

    /**
     * CXF
     */
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**
     * 注册 CXF 前缀 Servlet
     */
    @Bean
    public ServletRegistrationBean<CXFServlet> ws() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/ws/*");
    }

    /**
     * 注册服务：用于测试的 WebService
     */
    @Bean
    public Endpoint webServicesTestServiceEndpoint() {
        EndpointImpl testWebServiceEndpointImpl = new EndpointImpl(springBus(), webServicesTestService);
        testWebServiceEndpointImpl.publish("/testWebService");
        return testWebServiceEndpointImpl;
    }

    /**
     * 将 WebService 拦截器注册为 Bean
     * <p>
     * 使用 @Autowired
     */
    @Bean
    public WebServicesHandlerInterceptor webServicesHandlerInterceptor() {
        return new WebServicesHandlerInterceptor();
    }

    /**
     * 注册服务：用于测试的 用户 服务接口
     */
    @Bean
    public Endpoint testUser1ServiceEndpoint() {
        EndpointImpl testUser1ServiceEndpointImpl = new EndpointImpl(springBus(), testUser1Service);
        testUser1ServiceEndpointImpl.publish("/testUser1Service");

        // 自定义 WebService 拦截器
        testUser1ServiceEndpointImpl.getInInterceptors().add(webServicesHandlerInterceptor());

        return testUser1ServiceEndpointImpl;
    }

}
