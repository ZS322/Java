package regexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemoOne {

    public static void main(String[] args) {

        String context="^\\d{3}\\s{2}$";

        boolean matches1 = Pattern.matches(context, "113  ");
        System.out.println(matches1);
        Pattern p = Pattern.compile("[A-Za-a0-9_]{3}");
        Matcher m = p.matcher("111");
        boolean matches = m.matches();
        System.out.println(matches);

    }

}
