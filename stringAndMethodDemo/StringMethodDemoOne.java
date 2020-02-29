package stringAndMethodDemo;

import java.util.Arrays;

public class StringMethodDemoOne {

    public static void methodString(String target){

        /**返回目标字符串第一次出现的下标*/
        int position = target.indexOf("Z");
        System.out.println(position);

        /**返回目标字符串第最后一次出现的下标*/
        int lastIndex = target.lastIndexOf("i");
        System.out.println(lastIndex);

        int h = target.indexOf("h", 1);
        System.out.println(h);

        String goal ="test.png";

        /** 此字符串是否以指定的后缀结束 */
        boolean suffix = goal.endsWith("png");
        System.out.println(suffix);

        /**不考虑大小写比较两个字符串内容的值*/
        boolean consequence = target.equalsIgnoreCase(goal);
        System.out.println(consequence);
        int strHasCode = goal.hashCode();   /**返回字符串的hashcode*/
        System.out.println(strHasCode);

        byte[] bytes = goal.getBytes();

        String str = Arrays.toString(bytes);
        System.out.println(str);




    }

    public static void main(String[] args) {

        methodString("ZhiShi");

    }

}
