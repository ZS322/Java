package collectionInstancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Collections.shuffle() 方法来打乱集合元素的顺序
 */
public class collectionShuffle {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(i));
        }
        System.out.println("打乱前:");
        System.out.println(list);
        System.out.println("打乱后");
        for (int i = 1; i < 3; i++) {
            System.out.println("第"+i+"次");
            Collections.shuffle(list);  /** 集合打乱顺序 */
            System.out.println(list);
        }

    }

}
