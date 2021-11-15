package com.timeroar.blog.concurrent.theory.create;

/**
 * <p>ThreadMethod2</p>
 * 线程创建方式2
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/31 22:01
 */
public class ThreadMethod2 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程-实现Runnable接口方式运行成功");
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadMethod2());
        thread.start();
    }
}
