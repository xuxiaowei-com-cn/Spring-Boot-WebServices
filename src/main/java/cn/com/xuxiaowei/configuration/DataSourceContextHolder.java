package cn.com.xuxiaowei.configuration;

import cn.com.xuxiaowei.enums.DatabaseSourceEnum;

/**
 * 数据源内容
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<DatabaseSourceEnum> CONTEXT_HOLDER = new InheritableThreadLocal<>();

    /**
     * 设置数据源
     */
    public static void setDataSource(DatabaseSourceEnum db) {
        CONTEXT_HOLDER.set(db);
    }

    /**
     * 取得当前数据源
     */
    public static DatabaseSourceEnum getDataSource() {
        return CONTEXT_HOLDER.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear() {
        CONTEXT_HOLDER.remove();
    }

}
