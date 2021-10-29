package com.timeroar.blog.design.factory.abs;

/**
 * <p>CeleryFactory</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:52
 */
public class CeleryFactory extends KernelDumplingFactory{
    @Override
    public IStuffing createStuffing() {
        return new CeleryStuffing();
    }

    @Override
    public IPackage createBox() {
        return new CeleryBox();
    }
}
