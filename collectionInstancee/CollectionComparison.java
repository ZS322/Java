package collectionInstancee;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 *  集合比较
 */
public class CollectionComparison {

    public static void main(String[] args) {

        String[] soft = {"Firefox", "IDEA", "Android Studio"};

        Set<String> set = new TreeSet<String>();

        for (int i = 0; i < soft.length; i++) {
            set.add(soft[i]);
        }

        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i <= 10; i++) {
            System.out.print("-");
        }

        System.out.println("");
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

    }

}
