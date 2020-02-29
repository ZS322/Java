package javaInstanceDemo.string;

public class StringReplaceDemo {

    public static void main(String[] args) {

        String str="FireFox";
        String replace = str.replace('F', 'f');
        System.out.println(replace);

        String via = str.replaceAll("FireFox", "Via");
        System.out.println(via);
        String FireFox = str.replaceFirst("f", "F");
        System.out.println(FireFox);

    }

}
