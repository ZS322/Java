package calendarDemo;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar日历类的使用获取当前系统日期
 */
public class CalendarDemoOne {


    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2099,1,1);
        Date time = c.getTime();
        System.out.println(time);

        c.set(Calendar.DATE,10);

        c.set(Calendar.YEAR,3060);

        System.out.println(  c.getTime());

        c.add(Calendar.DATE,10);

        System.out.println(  c.getTime());

        Calendar c1=Calendar.getInstance();

        int year = c1.get(Calendar.YEAR);

        int month = c1.get(Calendar.MONTH) + 1;

        int date=c1.get(Calendar.DATE);

        int hour = c1.get(Calendar.HOUR_OF_DAY);

        int minute=c1.get(Calendar.MINUTE);

        int day=c1.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+"/"+month+"/"+date+" "+hour+":"+minute+" "+day);

    }

}
