package collectionInstancee;

import java.util.LinkedList;
import java.util.List;

/**
 * 集合中添加不同类型元素
 */
public class ToListAddNoTypeEle {

    public static void main(String[] args) {

        List list=new LinkedList();
        list.add("String");
        list.add(new Integer(1));
        list.add(new Double(2.3));
        list.add('A');

        System.out.println(list);

    }
}
