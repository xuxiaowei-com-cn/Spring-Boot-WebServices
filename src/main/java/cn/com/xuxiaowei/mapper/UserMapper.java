package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.annotation.DatabaseSource;
import cn.com.xuxiaowei.entity.User;
import cn.com.xuxiaowei.entity.UsersData;
import cn.com.xuxiaowei.enums.DatabaseSourceEnum;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据用户名查询用户信息及权限
     *
     * @param username 用户名
     * @return 返回 用户信息及权限
     */
    @DatabaseSource(DatabaseSourceEnum.MYSQL)
    UsersData selectAuthoritiesByUsername(@Param("username") String username);

}
