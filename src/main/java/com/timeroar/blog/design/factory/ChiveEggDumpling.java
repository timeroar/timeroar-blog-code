package com.timeroar.blog.design.factory;

/**
 * <p>ChiveDumpling</p>
 * 韭菜水饺
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 21:08
 */
public class ChiveEggDumpling implements IDumplings {
    @Override
    public void make() {
        System.out.println("制作韭菜鸡蛋水饺的过程");
    }
}
