package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo {

    /**方法one*/
    public static boolean checkBoxQQ(String content) {

       return content.matches("[1-9][0-9]{4,10}");

    }

    /**方法two*/
    public static boolean verify(String content) {

//        Pattern.matches()
        Pattern compile = Pattern.compile("[1-9][0-9]{4,10}");

        Matcher matcher = compile.matcher(content);

        boolean matches = matcher.matches();

        return matches;

    }


    public static void main(String[] args) {

//        boolean result = checkBoxQQ("011111");
//        System.out.println(result);

        boolean verify = verify("000000");
        System.out.println(verify);

    }

}
