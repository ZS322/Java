package javaInstanceDemo.string;

public class StringReverseDemo {

    public static void main(String[] args) {

        String str="Hello";
        String string = new StringBuffer(str).reverse().toString();
        System.out.println(str);
        System.out.println(string);

    }

}
