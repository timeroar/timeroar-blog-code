package com.timeroar.blog.framework.design.lsp;

/**
 * <p>Frog</p>
 * 青蛙-父类
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/15 19:21
 */
public class Frog {

    /**
     * 几条腿
     * */
    private int leg;

    public static int getArea(Frog area) {
        return area.getLeg();
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}
