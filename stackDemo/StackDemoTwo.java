package stackDemo;

import java.util.Stack;
import java.util.Vector;

public class StackDemoTwo {

    public static void main(String[] args) {

        Stack<String> stringStack=new Stack<>();
        stringStack.push("百度网盘");
        stringStack.push("油猴插件");

        while(!stringStack.empty()){
            System.out.println(stringStack.pop());
        }

//        stringStack.removeAllElements();
//        stringStack.remove("油猴插件");
//        System.out.println(stringStack.size());
        System.out.println(stringStack.size());
//        boolean remove = stringStack.remove("油猴插件");
//        System.out.println(remove);
//        System.out.println(stringStack.size());

        stringStack.clear();


    }

}
