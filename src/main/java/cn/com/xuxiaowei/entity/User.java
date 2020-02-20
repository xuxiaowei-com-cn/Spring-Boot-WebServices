package cn.com.xuxiaowei.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author 徐晓伟
 * @since 2020-02-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 用户主键
     */
        @TableId(value = "user_id", type = IdType.AUTO)
      private Long userId;

      /**
     * 用户名
     */
      @TableField("username")
    private String username;

      /**
     * 密码
     */
      @TableField("password")
    private String password;

      /**
     * 创建时间，MySQL 自动生成，与代码无关
     */
      @TableField("create_date")
    private LocalDateTime createDate;

      /**
     * 更新时间，MySQL 自动生成，与代码无关
     */
      @TableField("updata_date")
    private LocalDateTime updataDate;

      /**
     * 是否逻辑删除，1 已删除，0 未删除，默认为 0，数据库类型为 tinyint，长度为 1，对应实体类为 Boolean，0 为 false，1 为 true
     */
      @TableField("deleted")
    @TableLogic
    private Boolean deleted;


      public static final String USER_ID = "user_id";

      public static final String USERNAME = "username";

      public static final String PASSWORD = "password";

      public static final String CREATE_DATE = "create_date";

      public static final String UPDATA_DATE = "updata_date";

      public static final String DELETED = "deleted";

  }
