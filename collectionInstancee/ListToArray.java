package collectionInstancee;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转数组
 */
public class ListToArray {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("MYSQL");
        list.add("HeiSQL");

        /**     list.toArray(T [] t) 方法将集合转为数组   */
        String[] soft = list.toArray(new String[list.size()]);

        for(String softWare:soft){
            System.out.println(softWare);
        }

    }

}
