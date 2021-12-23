package com.timeroar.blog.concurrent.sync;

/**
 * <p>TestSyncronized</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/11/16 22:40
 */
public class ClassSynchronizedOne {
    public void test(){
        Lock lock = new Lock();
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                System.out.println("当前线程" + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
