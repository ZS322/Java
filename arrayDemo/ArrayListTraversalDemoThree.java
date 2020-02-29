package arrayDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * iterator迭代器遍历集合元素
 */
public class ArrayListTraversalDemoThree {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("DBeaver");
        list.add("PS-CS3");
        list.add("原型设计软件-MPlus");

        String [] biBeiSoftWare=new String[list.size()];
        list.toArray(biBeiSoftWare);

        for(int i=0;i<biBeiSoftWare.length;i++){
            System.out.println(biBeiSoftWare[i]);
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
