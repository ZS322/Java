package ioDemo;

import java.io.*;

/**
 * FileOutputStream/FileInputStream 输出流/输入流的读写文件的实现
 */
public class FileOutputAndInputStreamDemoOne {

    public static void main(String[] args) throws IOException {

        byte[] bWrite = {'A', 'B', 'C', 'D'};

        OutputStream os=new FileOutputStream("c:/learning/test.txt");

        for(int i=0;i<bWrite.length;i++){
            os.write(bWrite[i]);    //字节输出流 写数据
            os.flush();
        }
        os.close();

        //字节输入流 读数据
        InputStream is=new FileInputStream("c:/learning/test.txt");

        int size=is.available();

        System.out.println("可读参数:"+size);

        for(int j=0;j<size;j++){
            System.out.println((char)is.read()+"  ");
        }
        is.close();

    }

}
