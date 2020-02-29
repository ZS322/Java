package collectionInstancee;

import java.util.Arrays;
import java.util.Collections;

/**
 *  collection.reverse() 方法来反转集合中的元素
 */
public class CollectionReverse {

    public static void main(String[] args) {

        /**反转前*/
        String[] soft = {"Firefox", "IDEA", "Android Studio"};

        Collections.reverse(Arrays.asList(soft));

        System.out.println(Arrays.asList(soft));      /**反转后*/

    }

}
