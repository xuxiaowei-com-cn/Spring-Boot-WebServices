package cn.com.xuxiaowei.enums;

/**
 * 数据库枚举
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public enum DatabaseSourceEnum {

    /**
     * Oracle 数据库
     */
    ORACLE("oracle"),

    /**
     * MySQL 数据库
     */
    MYSQL("mysql"),

    /**
     * SQLServer 数据库
     */
    SQLSERVER("SQLServer");

    private String value;

    DatabaseSourceEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
