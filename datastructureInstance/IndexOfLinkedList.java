package datastructureInstance;

import java.util.LinkedList;

/**
 * indexOf和lastIndexOf获取元素的位置
 */
public class IndexOfLinkedList {

    public static void main(String[] args) {

        LinkedList lList = new LinkedList();
        lList.add("1");
        lList.add("2");
        lList.add("1");
        lList.add("2");
        System.out.println("元素 1 第一次出现的位置：" + lList.indexOf("1"));
        System.out.println("元素 2 最后一次出现的位置："+ lList.lastIndexOf("2"));
    }
}
