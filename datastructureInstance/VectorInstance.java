package datastructureInstance;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量元素的索引值
 */
public class VectorInstance {

    public static void main(String[] args) {

        Vector v=new Vector();
        v.add("内网穿透");
        v.add("翻译");
        v.add("正则表达式");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "翻译");
        System.out.println("索引值:"+index);

    }
}
