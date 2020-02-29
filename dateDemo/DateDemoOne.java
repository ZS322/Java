package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用Date类创建时间并且格式化日期打印
 */
public class DateDemoOne {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("H:m E");
        String currentDate = sdf.format(date);
        System.out.println(currentDate);

        System.out.printf("%tc", date);
        System.out.println();
        System.out.printf("%tF",date);
        System.out.println();
        System.out.printf("%tD",date);
        System.out.println();
        System.out.printf("%tT",date);
        System.out.println();
        System.out.printf("%tR",date);

    }

}
