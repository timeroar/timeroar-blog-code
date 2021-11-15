package com.timeroar.blog.framework.design.dip;

import com.timeroar.blog.framework.design.ocp.AbstractClothes;

/**
 * <p>Shopping</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/14 21:52
 */
public class Shopping {

    public void doShopping(AbstractClothes clothes){
        clothes.shopping();
    }


    public void buyErke(){
        System.out.println("买鸿星尔克牌的衬衣");
    }

    public void buyHLA(){
        System.out.println("买海澜之家牌的衬衣");
    }
}
