package ioDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader使用缓存字符串输入流 获取控制台写入的字符串
 */
public class BufferedReaderDemoOne {

    public static void main(String[] args)throws IOException {

        char c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符,按下'q'键退出");
        /** 使用do while 遍历打印单字符*/

        do {

            c=(char)br.read();  //使用read方法读取
            System.out.println(c);
        } while (c != 'q');

    }

}
