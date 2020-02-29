package collectionInstancee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 截取
 */
public class ListIndexOfSubList {

    public static void main(String[] args) {

        List list = Arrays.asList("one Two three one Two".split(" "));

        List subList = Arrays.asList("one Two".split(" "));

        System.out.println(subList);

        /**Collections 类的 indexOfSubList() 和 lastIndexOfSubList() 方法来查看子列表是否在列表中，并查看子列表在列表中所在的位置*/
        int indexOfSubList = Collections.indexOfSubList(list, subList);

        System.out.println(indexOfSubList);

        int lastIndexOfSubList = Collections.lastIndexOfSubList(list, subList);

        System.out.println(lastIndexOfSubList);
    }

}
