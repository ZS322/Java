package collectionInstancee;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 遍历 HashTable 的键值
 */
public class HashtableKey {

    public static void main(String[] args) {

        Hashtable ht = new Hashtable();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.keys();

        while (e.hasMoreElements()) {
            Object o = e.nextElement(); //key
            System.out.println(o+"=="+ht.get(o));   //通过key那value
        }

    }
}
