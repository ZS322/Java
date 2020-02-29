package regexDemo;

import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemoTwo {

    public static void main(String[] args) {

//              //规则
        String regex="...";

        //处理的字符串
        String content="aaa";

        boolean result = Pattern.matches(regex, content);

        System.out.println(result);

        System.out.println("请输入号码");


        Scanner scan=new Scanner(System.in);
        String qq = scan.nextLine();

        boolean result2 = qqJiaoYan(qq);

        System.out.println(result2);
    }


    public static boolean qqJiaoYan(String qq){

        //定义一个状态标记
        boolean flag=true;

        //定义一个判断qq号码是否正确的正则表达式
        String regex="[1-9][0-9]{4,10}";

        return qq.matches(regex);

    }














}
