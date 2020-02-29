package numberAndMathDemo;

import java.util.Random;

public class RandomDemoOne {

    public static void main(String[] args) {

        double random = (Math.random() * 9 + 1) * 1000;
        int random1 = (int) random;
        String s = String.valueOf(random1);
        System.out.println(s);//0.9b 8.1+1 9.1  9100.00000

//        Random ran = new Random();
        while (true) {
            int num = (int) (Math.random() * 10000);
            if (num >= 1000 && num <= 10000) {
                System.out.println(num);
                break;
            }
        }


    }

}
