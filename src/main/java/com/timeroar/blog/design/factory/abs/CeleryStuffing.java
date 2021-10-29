package com.timeroar.blog.design.factory.abs;

/**
 * <p>CeleryStuffing</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:50
 */
public class CeleryStuffing implements IStuffing{
    @Override
    public void deploy() {
        System.out.println("制作芹菜馅");
    }
}
