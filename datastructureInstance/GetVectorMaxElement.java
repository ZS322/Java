package datastructureInstance;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量的最大元素
 */
public class GetVectorMaxElement {

    public static void main(String[] args) {

        Vector vector=new Vector();
        vector.add(new Double("3.12"));
        vector.add(new Double("3.22"));
        vector.add(new Double("3.52"));
        vector.add(new Double("3.62"));

        /** Collections.max() 来获取向量的最大元素*/
        Object obj = Collections.max(vector);
        System.out.println(obj);
    }

}
