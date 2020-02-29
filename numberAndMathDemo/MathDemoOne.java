package numberAndMathDemo;

public class MathDemoOne {

    public static void main(String[] args) {

        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(1.3));
        System.out.println(Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        int abs = Math.abs(1);
        System.out.println(abs);
        int max = Math.max(10, 116);
        System.out.println(max);

        System.out.println(   Math.min(1,2));
        int i = Math.toIntExact(100);
        System.out.println(i);
        double ceil = Math.ceil(11.5);
        System.out.println(ceil);
        double floor = Math.floor(11.9);
        System.out.println(floor);
        double random = Math.random();
        System.out.println(random);
        long round = Math.round(1.4);   //四舍五入
        System.out.println(round);
    }

}
