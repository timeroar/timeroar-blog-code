package com.timeroar.blog.design.factory.abs;

/**
 * <p>KernelDumplingFactory</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:33
 */
public abstract class KernelDumplingFactory {

    /**
     * 这里用了上等秘方老面,统一制作
     * */
    public void makeWrapper() {
        System.out.println("制作出来水饺皮");
    }

    /** 调馅 */
    public abstract IStuffing createStuffing();

    /** 打包 */
    public abstract IPackage createBox();

}
