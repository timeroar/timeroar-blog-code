package com.timeroar.blog.framework.design.carp;

/**
 * <p>Person</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/15 20:27
 */
public class Person {

    private doShopping doShopping;

    public void whoDoShop(){
        System.out.println("老婆" + doShopping.shopping());
    }
    public com.timeroar.blog.framework.design.carp.doShopping getDoShopping() {
        return doShopping;
    }

    public void setDoShopping(com.timeroar.blog.framework.design.carp.doShopping doShopping) {
        this.doShopping = doShopping;
    }
}
