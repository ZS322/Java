package jdk8NewSpeciality;

import java.util.ArrayList;
import java.util.List;

public class LambdaTestTwo {

    public static void main(String[] args) {

        String[] soft = new String[]{"MYSQL", "JDK8", "IDEA"};
        List<String> softWare = new ArrayList<String>();
        printList(soft, softWare);

    }

    private static void printList(String[] soft, List<String> softWare) {

        for (int i = 0; i < 3; i++) {
            softWare.add(soft[i]);
        }
        /** 静态方法引用 它的语法是Class::static_method  */
        softWare.forEach(System.out::println);      /** foreach 使用java 8方法引用打印  */
    }

    static int test(){return 0;}
}
