package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.User;
import cn.com.xuxiaowei.entity.UsersData;
import cn.com.xuxiaowei.mapper.UserMapper;
import cn.com.xuxiaowei.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    /**
     * 根据用户名查询用户信息及权限
     *
     * @param username 用户名
     * @return 返回 用户信息及权限
     */
    @Override
    public UsersData getAuthoritiesByUsername(String username) {
        return baseMapper.selectAuthoritiesByUsername(username);
    }
}
