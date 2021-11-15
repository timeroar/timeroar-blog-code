package com.timeroar.blog.concurrent.theory.create;

/**
 * <p>ThreadMethod1</p>
 * 创建线程的方法1
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/31 21:56
 */
public class ThreadMethod1 extends Thread {

    @Override
    public void run() {
        System.out.println("线程启动了");
    }

    public static void main(String[] args) {
        ThreadMethod1 threadMethod1 = new ThreadMethod1();
        threadMethod1.start();
    }
}
