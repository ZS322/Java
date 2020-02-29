package collectionInstancee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类求最大、最小值
 */
public class ListMaxMin {

    public static void main(String[] args) {

        List list = Arrays.asList("SSR 7-zip SMPlayer".split(" "));

        System.out.println("最大值:" + Collections.max(list));
        System.out.println("最小值:" + Collections.min(list));


    }

}
