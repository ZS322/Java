package collectionInstancee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *  Collection 类的 iterator() 方法来遍历集合
 */
public class HashMapTraverse {

    public static void main(String[] args) {

        HashMap<String, String> softMap = new HashMap<>();
        softMap.put("one", "XDM");
        softMap.put("two", "IDM");
        softMap.put("three", "油猴插件");

        Collection<String> c1 = softMap.values();
        Iterator<String> it = c1.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
