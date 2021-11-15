package com.timeroar.blog.framework.design.ocp;

/**
 * <p>Shirt</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/13 17:03
 */
public class Shirt extends AbstractClothes {

    @Override
    public void shopping() {
        System.out.println("买鸿星尔克牌的衬衣");
    }

    @Override
    public void setType(String type) {
        super.setType("衬衣");
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand("鸿星尔克");
    }
}
