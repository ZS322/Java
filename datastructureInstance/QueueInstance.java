package datastructureInstance;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列（Queue）用法
 */
public class QueueInstance {

    public static void main(String[] args) {

        /**
         * add()和remove()方法在失败的时候会抛出异常(不推荐)
         */
        Queue<String> queue = new LinkedList<String>();
        /** 添加元素    */
        queue.offer("Git");
        queue.offer("雷电模拟器");
        queue.offer("Start UML");
        queue.offer("Mock plus");

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("====");
        System.out.println("poll=" + queue.poll());   /**返回第一个元素 并在队列中删除*/

        for (String q : queue) {
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element=" + queue.element());  //返回队列的头元素 不删除

        for (String q : queue) {
            System.out.println(q);
        }

        System.out.println("===");

        /**  在队列元素为空 情况下 peek() 方法只会返回 null */
        System.out.println("peel=" + queue.peek());   //返回队列的头元素 不删除

        for (String q : queue) {
            System.out.println(q);
        }

    }

}
