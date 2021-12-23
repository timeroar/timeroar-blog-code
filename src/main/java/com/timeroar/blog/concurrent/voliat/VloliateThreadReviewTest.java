package com.timeroar.blog.concurrent.voliat;

/**
 * <p>VloliateThreadTest</p>
 *
 * @author TimeRoar-Wang Ziming
 * @date 2021/12/4 18:28
 */
public class VloliateThreadReviewTest {
    //定义四个变量
    public static int a = 0, b = 0;
    public static int c = 0, d = 0;
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (true) {
            i++;
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            Thread thread = new Thread(() -> {
                a = 1;
                c = b;
            });

            Thread thread2 = new Thread(() -> {
                b = 1;
                d = a;
            });
            thread.start();
            thread2.start();
            thread.join();
            thread2.join();
            if (c == 0 && d == 0) {
                System.out.println("第" + i + "次出现");
                break;
            }
        }
    }
}
