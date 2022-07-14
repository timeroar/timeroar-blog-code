package com.timeroar.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>SortTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/6/17 13:48
 */
public class SortTest {
    public static void main(String[] args) {
    String i = "2022上半年";
        System.out.println(i.substring(0, 4));
        System.out.println(i.substring(4, 5));


        ArrayList<String> list = new ArrayList<>(Arrays.asList("2022上半年,2021全年", "2019全年", "2022全年"));
        List<String> collect = list.stream().sorted((o1, o2) -> {
            String one = o1.substring(0, 4);
            String two = o2.substring(0, 4);
            if (Integer.parseInt(one) > Integer.parseInt(two)) {
                return 1;
            } else if (Integer.parseInt(one) < Integer.parseInt(two)) {
                return -1;
            } else {
                return 0;
            }
        }).collect(Collectors.toList());
        System.out.println(collect);
    }
}
