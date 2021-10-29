package com.timeroar.blog.design.factory.abs;

/**
 * <p>CabbageStuffing</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:49
 */
public class CabbageStuffing implements IStuffing{
    @Override
    public void deploy() {
        System.out.println("制作白菜馅");
    }
}
