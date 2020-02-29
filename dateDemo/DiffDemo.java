package dateDemo;

import java.util.Date;

/**
 * 使用System.currentTimeMillis方法求耗时
 */
public class DiffDemo {

    public static void main(String[] args) {

        try {
            long start = System.currentTimeMillis();    //求耗时
            System.out.println(new Date() + "\n");
            Thread.sleep(3000);
            System.out.println(new Date()+"\n");
            long end = System.currentTimeMillis();
            long diff=end-start;
            System.out.println(diff/1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
