package com.timeroar.blog.concurrent.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>CreateThreadPool</p>
 * 创建线程池
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/27 21:51
 */
public class CreateThreadPool {

    /*public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        ExecutorService executorService3 = Executors.newWorkStealingPool();
    }*/
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new TestTask());
        executor.shutdown();
    }
    static class TestTask implements Runnable{
        @Override
        public void run() {
            System.out.println("线程执行了");
        }
    }
}
