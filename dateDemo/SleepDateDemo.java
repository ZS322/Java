package dateDemo;

import java.util.Date;

/**
 * 使用线程的Thread.sleep让程序阻塞
 */
public class SleepDateDemo {

    public static void main(String[] args) {

        try {
            System.out.println(new Date()+"\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date()+"\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
