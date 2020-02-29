package datastructureInstance;

import java.util.LinkedList;

/**
 * 获取链表的元素
 */
public class LinkedListGetElement {

    LinkedList softWareList=new LinkedList();

    public void push(Object v){
        softWareList.addFirst(v);
    }

    public Object top(){
        return softWareList.getFirst();
    }

    public Object pop(){
        return softWareList.removeFirst();
    }

    private int size(){
        return softWareList.size();
    }

    public static void main(String[] args) {

        LinkedListGetElement stack = new LinkedListGetElement();
        for(int i=35;i<40;i++){
            stack.push(new Integer(i));
        }

        System.out.println(stack.top());    //回去打印链表的元素不删除

        System.out.println(stack.pop());    //输出链表元素并移除
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.size());

    }

}
