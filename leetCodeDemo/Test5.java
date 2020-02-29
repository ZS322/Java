package leetCodeDemo;

import java.util.Arrays;

/**
 * 泛型相关的的操作
 */
public class Test5 {

    public static <T> int methodTest(T [] data) {

        for(T t:data){
            System.out.println(t);
        }
        return 0;
    }

    public static void main(String[] args) {

        String[] soft = {"MYSQL", "Chrome", "uTools"};
        Object [] obj={new Test(),new Test()};
        methodTest(obj);


    }
}
