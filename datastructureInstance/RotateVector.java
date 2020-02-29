package datastructureInstance;

import java.util.Collections;
import java.util.Vector;

/**
 * 使用 swap() 函数来旋转向量
 */
public class RotateVector {

    public static void main(String[] args) {

        Vector<String> v=new Vector<>();
        v.add("百度");
        v.add("有道云笔记");
        v.add("12306");

        System.out.println(v);

        //旋转向量
        Collections.swap(v,0,2);

        System.out.println("旋转后");

        System.out.println(v);

    }

}
