package ioDemo;

import java.io.*;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        InputStream f = new FileInputStream("C:/java/hello");

        File f2 = new File("C:/java/hello");

        InputStream f3 = new FileInputStream(f2);

    }

}
