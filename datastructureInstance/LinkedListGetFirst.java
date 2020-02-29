package datastructureInstance;

import java.util.LinkedList;

/**
 * 获取链表的头元素和尾元素
 */
public class LinkedListGetFirst {

    public static void main(String[] args) {

        LinkedList<String> softWareList=new LinkedList<String>();
        softWareList.add("uTools");
        softWareList.add("rd");
        softWareList.add("MQ");
        softWareList.add("lef");

        System.out.println("链表的第一个元素是:"+softWareList.getFirst());
        System.out.println("链表的第最后一个元素是:"+softWareList.getLast());

    }

}
