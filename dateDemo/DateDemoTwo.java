package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用Date类创建时间并且格式化日期打印
 */
public class DateDemoTwo {

    public static void main(String[] args) {

        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(" y年M月d日 HH:mm");
        String format = sdf.format(date);
        System.out.println(format);

    }

}
