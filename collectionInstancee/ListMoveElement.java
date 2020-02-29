package collectionInstancee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 循环移动元素
 */
public class ListMoveElement {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("uTools 油猴 支付宝".split(" "));

        System.out.println(list);

        Collections.rotate(list,2);

        System.out.println(list);

    }

}
