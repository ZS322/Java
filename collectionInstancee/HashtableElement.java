package collectionInstancee;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * - 使用 Enumeration 遍历 HashTable
 */
public class HashtableElement {

    public static void main(String[] args) {

        Hashtable ht = new Hashtable();

        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");

        Enumeration e = ht.elements();  //elements 获取values

        while (e.hasMoreElements()) {

            System.out.println(e.nextElement());

        }

    }
}
