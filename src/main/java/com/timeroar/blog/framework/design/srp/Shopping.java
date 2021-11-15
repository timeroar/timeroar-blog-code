package com.timeroar.blog.framework.design.srp;

/**
 * <p>Shopping</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/14 22:45
 */
public class Shopping {
    public void shop(String brand){
        if (brand.equals("hla")) {
            doSomething(brand);
            System.out.println("我给自己买了");
        } else {
            doSomething(brand);
            System.out.println("我买给别人");
        }
    }
    public void doSomething(String brand){
        System.out.println("我准备刷卡买" + brand);
    }
}
