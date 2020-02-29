package datastructureInstance;

import java.util.LinkedList;

/**
 *  链表修改
 */
public class LinkedListUpdate {

    public static void main(String[] args) {

        LinkedList soft=new LinkedList();
        soft.add("7-ZiP");
        soft.add("CS3");
        soft.add("DBeaver");
        soft.add("MySQL Server8.0");
        soft.add("Notepad++");

        System.out.println(soft);

        soft.set(1,"Chrome");

        System.out.println("=======");

        System.out.println(soft);
    }

}
