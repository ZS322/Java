package hashtableDemo;

import java.util.Hashtable;
import java.util.Set;

/**
 * Hashtable 的使用 以及遍历输出
 */
public class HashtableDemoOne {

    public static void main(String[] args) {

        Hashtable table=new Hashtable();
        table.put(1,"one");
        table.put(2,"two");
        table.put(3,"three");


        Set set = table.entrySet();

        for(Object t:set){
            System.out.println(t);
        }

    }

}
