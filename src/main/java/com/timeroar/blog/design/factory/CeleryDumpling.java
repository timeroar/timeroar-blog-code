package com.timeroar.blog.design.factory;

/**
 * <p>PorkDumpling</p>
 * 芹菜水饺
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 21:27
 */
public class CeleryDumpling implements IDumplings {
    @Override
    public void make() {
        System.out.println("制作芹菜水饺的过程");
    }
}
