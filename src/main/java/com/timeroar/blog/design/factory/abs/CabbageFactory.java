package com.timeroar.blog.design.factory.abs;

/**
 * <p>CabbageFactory</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:51
 */
public class CabbageFactory extends KernelDumplingFactory{

    @Override
    public IStuffing createStuffing() {
        return new CabbageStuffing();
    }

    @Override
    public IPackage createBox() {
        return new CabbageBox();
    }
}
