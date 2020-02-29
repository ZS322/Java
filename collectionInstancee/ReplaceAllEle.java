package collectionInstancee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 元素替换
 */
public class ReplaceAllEle {

    public static void main(String[] args) {

        //
        List<String> num = Arrays.asList("One One DBeaver".split(" "));
        System.out.println(num);

        /** Collections 类的 replaceAll() 来替换List中所有的指定元素  */
        Collections.replaceAll(num,"One","Chrome");
        System.out.println(num);
    }

}
