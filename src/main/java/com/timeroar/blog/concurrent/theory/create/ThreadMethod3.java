package com.timeroar.blog.concurrent.theory.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * <p>ThreadMethod3</p>
 * 线程创建方式3
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/10/31 22:09
 */
public class ThreadMethod3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "当前线程执行成功,这个是返回结果";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadMethod3 threadMethod3 = new ThreadMethod3();
        FutureTask<String> futureTask = new FutureTask<>(threadMethod3);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
