package cn.com.xuxiaowei.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 用户和权限 数据类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UsersData extends User {

    private List<Authorities> authorities;

    @Override
    public String toString() {
        return "UsersData{" +
                "authorities=" + authorities +
                "} " + super.toString();
    }

}
