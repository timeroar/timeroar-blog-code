package com.timeroar.blog.design.factory.method;

import com.timeroar.blog.design.factory.IDumplings;

/**
 * <p>IDumplingFactory</p>
 * 水饺制造厂
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:08
 */
public interface IDumplingFactory {
    /**
     * 启动水饺流水线
     *
     * @return 指定水饺的流水线
     */
    IDumplings create();
}
