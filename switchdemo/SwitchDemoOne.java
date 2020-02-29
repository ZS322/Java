package switchdemo;

public class SwitchDemoOne {

    public static void charSwitchTest() {

        char grade = 'C';

        switch (grade) {

            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }

    public static void stringSwitchTest() {

        String target = "90";

        switch (target) {

            case "10":
                System.out.println("及格");
                break;
            case "90":
                System.out.println("牛逼");
                break;
            case "100":
                System.out.println("真牛逼");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }

    public static void intSwitchTest() {

        int target = 10;

        switch (target) {

            case 1:
                System.out.println("及格");
                break;
            case 10:
                System.out.println("厉害");
                break;
            case 100:
                System.out.println("真牛逼");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }


    public static void main(String[] args) {

//        stringSwitchTest();
        intSwitchTest();
    }

}
