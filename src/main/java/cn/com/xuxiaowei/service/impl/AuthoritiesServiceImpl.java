package cn.com.xuxiaowei.service.impl;

import cn.com.xuxiaowei.entity.Authorities;
import cn.com.xuxiaowei.mapper.AuthoritiesMapper;
import cn.com.xuxiaowei.service.IAuthoritiesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限 服务实现类
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
@Service
public class AuthoritiesServiceImpl extends ServiceImpl<AuthoritiesMapper, Authorities> implements IAuthoritiesService {

}
