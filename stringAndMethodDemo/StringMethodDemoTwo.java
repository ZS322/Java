package stringAndMethodDemo;

import java.util.Arrays;

public class StringMethodDemoTwo {

    public static void methodString(String target){

        boolean zh = target.matches("ZhiShi");
        System.out.println(zh);

        String replace = target.replace('Z', 'O');
        System.out.println(replace);
        String replace1 = target.replace("Zhi", "Junge");
        System.out.println(replace1);

        String s = target.replaceAll("ZhiShi", "je");
        System.out.println(s);
        boolean z = target.startsWith("Zh"); //由哪些字符串开头
        System.out.println(z);

        String goal="one-two";
        String[] is = goal.split("-");
//        String[] is = goal.split("-",0);
        System.out.println(Arrays.toString(is));


        //包括index：3
        String substring = goal.substring(3);
        System.out.println(substring);

        //不包3
        String substring1 = goal.substring(0, 3);
        System.out.println(substring1);

        //字符串变chars数组
        char[] chars = goal.toCharArray();
        System.out.println(Arrays.toString(chars));

        //
        String s1 = goal.toUpperCase();
        System.out.println(s1);

        String s2 = "two-three ";
        System.out.println(s2);
        String trim = s2.trim();
        System.out.println(trim);
        boolean empty = goal.isEmpty();
        System.out.println(empty);

        boolean one = goal.contains("one"); //包含
        System.out.println(one);
        int i = goal.codePointAt(1);
        System.out.println(i);

    }

    public static void main(String[] args) {

        methodString("ZhiShi");

    }

}
