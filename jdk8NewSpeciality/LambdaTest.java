package jdk8NewSpeciality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    public static void main(String[] args) {

        String[] soft = new String[]{"MYSQL", "JDK8", "IDEA"};
        List<String> softWare = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            softWare.add(soft[i]);
        }
//        sortJavaEight(softWare);
//        System.out.println(softWare);

        sortJavaSeven(softWare);
        System.out.println(softWare);

        int row = LambdaTestTwo.test();
        System.out.println(row);
    }

    /**
     * JAVA 7 排序
     * @param data
     */
    private static void sortJavaSeven(List<String> data){

        Collections.sort(data, new Comparator<String>() {
            @Override
            public int compare(String d1, String d2) {
                return d1.compareTo(d2);
            }
        });
    }

    /**
     * JAVA 8 排序
     * @param data
     */
    private static void sortJavaEight(List<String> data) {

        Collections.sort(data,(d1,d2)->d1.compareTo(d2));
//        Collections.sort(data);
    }

}
