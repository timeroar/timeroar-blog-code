package com.timeroar.blog.design.factory.method;

import com.timeroar.blog.design.factory.CabbageDumpling;
import com.timeroar.blog.design.factory.IDumplings;

/**
 * <p>CabbageDumplingFactory</p>
 * 白菜水饺制作流水线
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:14
 */
public class CabbageDumplingFactory implements IDumplingFactory {
    @Override
    public IDumplings create() {
        return new CabbageDumpling();
    }
}
