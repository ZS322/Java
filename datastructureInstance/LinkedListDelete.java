package datastructureInstance;

import java.util.LinkedList;

/**
    删除链表中的元素
 */
public class LinkedListDelete {

    public static void main(String[] args) {

        LinkedList<String> soft = new LinkedList<String>();

        soft.add("WeChat");
        soft.add("Via");
        soft.add("Map");
        soft.add("JD");
        soft.add("TIM");

        System.out.println(soft);

        soft.subList(1, 3).clear();     //via map 被删除

        System.out.println(soft);


    }

}
