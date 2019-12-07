package cn.com.xuxiaowei.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 测试实体类
 *
 * @author xuxiaowei
 */
@Data
public class TestUser1 implements Serializable {

    private static final long serialVersionUID = 6509111665955054934L;

    /**
     * 用户 ID
     */
    private int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
