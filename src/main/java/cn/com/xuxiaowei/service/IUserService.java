package cn.com.xuxiaowei.service;

import cn.com.xuxiaowei.entity.User;
import cn.com.xuxiaowei.entity.UsersData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
public interface IUserService extends IService<User> {

    /**
     * 根据用户名查询用户信息及权限
     *
     * @param username 用户名
     * @return 返回 用户信息及权限
     */
    UsersData getAuthoritiesByUsername(String username);

}
