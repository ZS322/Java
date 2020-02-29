package GregorianCalendarDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 使用Calendar的标准GregorianCalendar实现类 打印currentTime
 */
public class GregorianCalendarDemo {

    public static void main(String[] args) {

        String months[] = {
          "Jan", "Feb", "Mar", "Apr",
          "May", "Jun", "Jul", "Aug",
          "Sep", "Oct", "Nov", "Dec"};

        int year;

        //初始化Gregorian日历
        GregorianCalendar gc = new GregorianCalendar();

        year = gc.get(Calendar.YEAR);

        System.out.println(year);

        /**月份*/
        String month = months[gc.get(Calendar.MONTH)];

        System.out.println(month);

        int day = gc.get(Calendar.DATE);

        System.out.println(day);

        System.out.println("===========");

        System.out.println("Time:");

        System.out.println(gc.get(Calendar.HOUR_OF_DAY));

        System.out.println(gc.get(Calendar.MINUTE));

        System.out.println(gc.get(Calendar.SECOND));

        System.out.println(gc.isLeapYear(year)?"是":"否");


    }

}
