package com.timeroar.blog.framework.design.lod;

import java.util.ArrayList;

/**
 * <p>Person</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/14 23:23
 */
public class Person {
    public void checkRiver(River river){
        ArrayList<Fish> fish = new ArrayList<>();
        fish.add(new Fish());
        fish.add(new Fish());
        fish.add(new Fish());
        river.countFish(fish);
    }
}
