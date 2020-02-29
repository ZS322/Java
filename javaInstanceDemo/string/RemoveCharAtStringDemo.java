package javaInstanceDemo.string;

public class RemoveCharAtStringDemo {

    public static void main(String[] args) {

        String target = "HeiSQL";
        String result = removeCharAt(target, 3);
        System.out.println(result);

    }

    /**substring删除*/
    public static String removeCharAt(String content, int pos) {

        return content.substring(0, pos)+content.substring(pos+1);

    }

}
