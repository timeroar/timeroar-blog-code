package com.timeroar.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>MathTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/6/25 19:29
 */
public class MathTest {
    public static void main(String[] args) {
        ArrayList<List<Object>> objects = new ArrayList<>(4);
        for (int j = 0; j < 4; j++) {
            objects.add(new ArrayList<>());
        }
        objects.get(4);
    }
}
