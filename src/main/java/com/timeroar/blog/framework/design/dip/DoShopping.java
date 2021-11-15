package com.timeroar.blog.framework.design.dip;

/**
 * <p>DoShopping</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/14 21:56
 */
public class DoShopping {

    public static void main(String[] args) {
        /*Shopping shopping = new Shopping();
        shopping.buyErke();
        shopping.buyHla();*/
        Shopping shopping = new Shopping();
        shopping.doShopping(new ErkeShirt());
        shopping.doShopping(new HlaShirt());
    }
}
