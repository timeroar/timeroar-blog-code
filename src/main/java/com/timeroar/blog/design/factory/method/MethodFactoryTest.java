package com.timeroar.blog.design.factory.method;

/**
 * <p>MethodFactoryTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:17
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        //开启白菜水饺流水线
        CabbageDumplingFactory cabbageDumplingFactory = new CabbageDumplingFactory();
        //开启芹菜水饺流水线
        CeleryDumplingFactory celeryDumplingFactory = new CeleryDumplingFactory();
        //开始制作白菜水饺
        cabbageDumplingFactory.create().make();
        //开始制作芹菜水饺
        celeryDumplingFactory.create().make();
    }
}
