package com.timeroar.blog.design.factory;

/**
 * <p>CabbageDumpling</p>
 * 白菜馅水饺
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/29 21:10
 */
public class CabbageDumpling implements IDumplings {
    @Override
    public void make() {
        System.out.println("制造白菜水饺的过程");
    }
}
