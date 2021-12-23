package com.timeroar.blog.concurrent.sync;

/**
 * <p>StaticSynchronized</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/17 20:32
 */
public class StaticSynchronized {
    public static int i = 0;
    public synchronized static void increment() {
        i++;
    }
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    StaticSynchronized.increment();
                }
            });
            threads[i].start();
        }
        threads[0].join();
        threads[1].join();
        System.out.println("执行结果为:" + StaticSynchronized.i);
    }
}
