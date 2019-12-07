package cn.com.xuxiaowei.mapper;

import cn.com.xuxiaowei.entity.TestUser1;
import org.apache.ibatis.annotations.Param;

/**
 * 测试 Mapper接口
 *
 * @author xuxiaowei
 */
public interface TestUser1Mapper {

    /**
     * 根据 id 查询用户
     *
     * @param id ID
     * @return 用户信息
     */
    TestUser1 selectById(@Param("id") String id);

}
