package com.timeroar.blog.design.factory.abs;

/**
 * <p>CeleryBox</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 22:51
 */
public class CeleryBox implements IPackage{
    @Override
    public void box() {
        System.out.println("芹菜水饺打包");
    }
}
