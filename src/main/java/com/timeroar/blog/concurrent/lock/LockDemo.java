package com.timeroar.blog.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>LockDemo</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/26 11:59
 */
public class LockDemo {

    private static ReentrantLock lock = new ReentrantLock();
    private static int count = 0;

    public void increment(){
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LockDemo lockDemo = new LockDemo();
        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int y = 0; y < 10000; y++) {
                    lockDemo.increment();
                }
            });
            threads[i].start();
        }
        threads[0].join();
        threads[1].join();
        System.out.println(LockDemo.count);
    }
}
