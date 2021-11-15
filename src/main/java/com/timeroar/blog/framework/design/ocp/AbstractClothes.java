package com.timeroar.blog.framework.design.ocp;

import javax.swing.*;

/**
 * <p>AbstractShirt</p>
 * 开闭原则
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/13 17:02
 */
public abstract class AbstractClothes implements IClothes {

    private String type;

    private String brand;

    @Override
    public String brand() {
        return brand;
    }

    @Override
    public String type() {
        return type;
    }

    public abstract void shopping();

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
