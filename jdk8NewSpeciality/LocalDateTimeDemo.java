package jdk8NewSpeciality;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        // // 获取当前的日期时间
        LocalDateTime currentDate = LocalDateTime.now();

        System.out.println(currentDate.toString());

        LocalDate date = currentDate.toLocalDate();

        System.out.println("date: " + date);
        try {

            //反射
            Class.forName("");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
