package com.timeroar.test;

import java.io.Serializable;

/**
 * <p>TestEntity</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2022/5/16 13:35
 */
public class TestEntity implements Serializable {

    private String name;

    private String test;

    private String age;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
