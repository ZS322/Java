package datastructureInstance;

import java.util.LinkedList;

public class LinkedListAddFirst {

    public static void main(String[] args) {

        LinkedList<String> softWareList=new LinkedList<String>();
        softWareList.add("百度脑图");
        softWareList.add("Dark Reader插件");
        softWareList.add("Chrome");
        softWareList.add("AdBlock plus");
        System.out.println(softWareList);
        softWareList.addFirst("菜鸟教程");
        softWareList.addLast("TamperMonkey插件");
        System.out.println("程序员必备:");
        System.out.println(softWareList);

    }

}
