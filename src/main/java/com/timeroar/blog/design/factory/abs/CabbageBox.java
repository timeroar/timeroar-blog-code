package com.timeroar.blog.design.factory.abs;

/**
 * <p>CabbageBox</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:50
 */
public class CabbageBox implements IPackage{
    @Override
    public void box() {
        System.out.println("白菜水饺打包");
    }
}
