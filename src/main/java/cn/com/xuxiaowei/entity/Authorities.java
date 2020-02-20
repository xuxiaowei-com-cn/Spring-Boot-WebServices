package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 权限
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName("authorities")
public class Authorities implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId("username")
      private String username;

    @TableField("authority")
    private String authority;


      public static final String USERNAME = "username";

      public static final String AUTHORITY = "authority";

  }
