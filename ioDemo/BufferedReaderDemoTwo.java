package ioDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader使用缓存字符串输入流 获取控制台写入的字符串
 */
public class BufferedReaderDemoTwo {

    public static void main(String[] args)throws IOException {

        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' ti exit");

        do {

            str=br.readLine();  //使用readLine方法读取 一行一行读取
            System.out.println(str);

        } while (!(str.equals("end")));

    }

}
