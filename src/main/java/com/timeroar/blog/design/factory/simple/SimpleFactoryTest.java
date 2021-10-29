package com.timeroar.blog.design.factory.simple;

/**
 * <p>SimpleFactoryTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 21:13
 */
public class SimpleFactoryTest {

    /**
     * 原始写法
     * */
//    public static void main(String[] args) {
//        //准备好韭菜馅水饺的制作工序
//        IDumplings chiveEggDumpling = new ChiveEggDumpling();
//        //开始制作-韭菜馅水饺
//        chiveEggDumpling.make();
//        //准备好白菜馅水饺的制作工序
//        IDumplings cabbageDumpling = new CabbageDumpling();
//        //开始制作-白菜馅水饺
//        cabbageDumpling.make();
//        //准备好芹菜馅水饺的制作工序
//        IDumplings celeryDumpling = new CeleryDumpling();
//        //开始制作-芹菜馅水饺
//        celeryDumpling.make();
//    }
    /**
     * 简单工厂写法
     * */
    public static void main(String[] args) {
        //制作韭菜馅水饺
        IDumplings chiveEgg = DumplingFactory.get("chiveEgg");
        chiveEgg.make();
        //制作白菜馅水饺
        IDumplings cabbage = DumplingFactory.get("cabbage");
        cabbage.make();
        //制作芹菜馅水饺
        IDumplings celery = DumplingFactory.get("celery");
        celery.make();
    }
}
