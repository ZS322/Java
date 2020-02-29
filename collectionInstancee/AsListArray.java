package collectionInstancee;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 */
public class AsListArray {

    public static void main(String[] args) {

        int n = 5;
        String[] name = new String[n];
        for (int i=0;i<n;i++) {
            name[i]=String.valueOf(i);
        }

        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li:list){
            String str=li;
            System.out.print(str+"");
        }
    }
}
