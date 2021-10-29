package com.timeroar.blog.design.factory.method;

import com.timeroar.blog.design.factory.CeleryDumpling;
import com.timeroar.blog.design.factory.IDumplings;

/**
 * <p>ICeleryDumplingFactory</p>
 * 芹菜水饺制作流水线
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:15
 */
public class CeleryDumplingFactory implements IDumplingFactory{
    @Override
    public IDumplings create() {
        return new CeleryDumpling();
    }
}
