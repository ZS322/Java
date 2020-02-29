package characterDemo;

/**
 * char 单字符的使用和封装类的使用
 */
public class CharacterDemoOne {

    public static void main(String[] args) {

        char ch='a';

        System.out.println(ch); //打印char

        char uniChar='\u039A';  //  Unicode 码赋值

        System.out.println(uniChar);

        char [] charArray={'a','b','c','e'};    //char数组

        int length = charArray.length;  //char数组索引

        System.out.println(length);

        Character ch2='a';      //包装类Character
        System.out.println(ch2);

        Character ch3 = new Character('a');
        System.out.println("\f"+"\t");

        boolean digit = Character.isLetter('1');
        System.out.println(digit);
    }

}
