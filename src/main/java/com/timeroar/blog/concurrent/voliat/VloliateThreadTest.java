package com.timeroar.blog.concurrent.voliat;

/**
 * <p>VloliateThreadTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/4 18:28
 */
public class VloliateThreadTest {
    public static volatile Boolean TYPE = true;
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (TYPE) {
                i++;
            }
        });
        thread.start();
        System.out.println("线程已启动");
        Thread.sleep(1000);
        TYPE = false;
    }
}
