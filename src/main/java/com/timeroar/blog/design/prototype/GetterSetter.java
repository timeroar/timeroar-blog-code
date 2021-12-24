package com.timeroar.blog.design.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <p>GetterSetter</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/23 23:34
 */
public class GetterSetter {

    /** 案例一 */
   /* public static void main(String[] args) throws CloneNotSupportedException {
        OldDomain old = new OldDomain();
        NewDomain newDomain = new NewDomain();
        newDomain.setAddress(old.getAddress());
        newDomain.setAge(old.getAge());
        newDomain.setName(old.getName());
        newDomain.setIdCard(old.getIdCard());
        newDomain.setPhone(old.getPhone());
    }*/

    /** 案例二 */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        NewDomain newDomain = new NewDomain();
        newDomain.setAddress("中国");
        newDomain.setName("法外狂徒张三");
        newDomain.setCars(new ArrayList<>(Arrays.asList("自行车","三轮车")));
        NewDomain cloneNewDomain = newDomain.deepClone();
        System.out.println("第一个对象---------" + newDomain.getCars());
        System.out.println("克隆对象----------" + cloneNewDomain.getCars());
        newDomain.getCars().add("电动车");
        System.out.println("第一个对象赋值后---------" + newDomain.getCars());
        System.out.println("克隆对象----------" + cloneNewDomain.getCars());
    }
}
