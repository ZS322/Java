package ioDemo;

import java.io.*;

/**
 * 处理读写文件的乱码问题
 */
public class FileOutputAndInputStreamDemoTwo {

    public static void main(String[] args) throws IOException {

        File f = new File("c:/learning/instance.txt");
        OutputStream fos = new FileOutputStream(f);   //子类继承父类 -> 多态

        /** 字符输出流 参数可以指定编码,默认为操作系统默认编码,windows上是gbk */
        OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");

        /** 写入到缓冲区 */
        osw.append("中文输入");

        // 换行
        osw.append("\r\n");

        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入
        osw.append("English");

        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        osw.close();

        // 关闭输出流,释放系统资源
        fos.close();

        /**构建FileInputStream对象*/
        FileInputStream fip=new FileInputStream(f);

        /**构建FileInputStream对象,编码与写入相同*/
        InputStreamReader reader=new InputStreamReader(fip,"UTF-8");

        StringBuffer sb=new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());

        /**关闭流*/
        reader.close();

        fip.close();

    }
}
