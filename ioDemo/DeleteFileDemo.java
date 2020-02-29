package ioDemo;

import java.io.File;

/**
 * 删除文件
 */
public class DeleteFileDemo {

    public static void main(String[] args) {

        //删除文件
        String fileName="c:/learning/instance2/text.txt";
        deleteFolder(fileName);
    }


    public static void deleteFolder(String target){

        File file=new File(target);
        file.delete();

    }

}
