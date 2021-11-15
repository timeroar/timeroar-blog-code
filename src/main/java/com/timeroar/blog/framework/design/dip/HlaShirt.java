package com.timeroar.blog.framework.design.dip;

import com.timeroar.blog.framework.design.ocp.AbstractClothes;

/**
 * <p>Shirt</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/13 17:03
 */
public class HlaShirt extends AbstractClothes {

    @Override
    public void shopping() {
        System.out.println("买海澜之家牌的衬衣");
    }

    @Override
    public void setType(String type) {
        super.setType("衬衣");
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand("海澜之家");
    }
}
