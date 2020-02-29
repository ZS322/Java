package javaInstanceDemo.string;

public class SearchLastString {

    public static void main(String[] args) {

        String content="oneThree";

        int index = content.indexOf("e");

        int lastIndex = content.lastIndexOf("e");

        System.out.println(index);

        System.out.println(lastIndex);

    }

}
