package com.timeroar.blog.design.factory.simple;

import com.timeroar.blog.design.factory.CabbageDumpling;
import com.timeroar.blog.design.factory.CeleryDumpling;
import com.timeroar.blog.design.factory.ChiveEggDumpling;
import com.timeroar.blog.design.factory.IDumplings;

/**
 * <p>DumplingFactory</p>
 * 水饺制作工厂
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 21:37
 */
public class DumplingFactory {
    /**
     * 根据你想要的吃的 获取哪种水饺
     * */
    public static IDumplings get(String dumplingName){
        switch (dumplingName) {
            case "cabbage":
                return new CabbageDumpling();
            case "chiveEgg":
                return new ChiveEggDumpling();
            case "celery":
                return new CeleryDumpling();
            default:
                return null;
        }
    }
}
