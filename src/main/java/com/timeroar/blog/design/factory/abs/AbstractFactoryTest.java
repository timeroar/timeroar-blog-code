package com.timeroar.blog.design.factory.abs;

/**
 * <p>AbstractFactoryTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 23:01
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //开启白菜水饺流水线
        CabbageFactory cabbageFactory = new CabbageFactory();
        //做皮
        cabbageFactory.makeWrapper();
        //调馅
        cabbageFactory.createStuffing();
        //打包
        cabbageFactory.createBox();
    }
}
