package collectionInstancee;

import java.util.LinkedList;
import java.util.List;

/**
 * 删除集合中指定元素
 */
public class ListRemove {

    public static void main(String[] args) {


        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        System.out.println(list);

        list.remove("two");
        System.out.println(list);

    }
}
