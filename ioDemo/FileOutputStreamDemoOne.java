package ioDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemoOne {

    public static void main(String[] args) throws IOException {

        OutputStream os=new FileOutputStream("c:/java/hello");

        File f=new File("c:/java/hello");

        OutputStream os2=new FileOutputStream(f);

    }

}
