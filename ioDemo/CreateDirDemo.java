package ioDemo;

import java.io.File;
import java.io.IOException;

/**
 *  使用File类的方法创建文件/目录
 */
public class CreateDirDemo {

    public static void main(String[] args) throws IOException {

        String folderName = "c:/learning/instance2/instance";
        createFolder(folderName);   //创建目录
        String fileName = "c:/learning/instance2/text.txt";
        createFile(fileName);   //创建具体的文件
    }

    public static void createFolder(String dirName) {

        File createFolder = new File(dirName);
        createFolder.mkdirs();  //创建目录（父级目录也创建）
    }

    public static void createFile(String dirName) throws IOException {

        File createFile = new File(dirName);

        boolean newFile = createFile.createNewFile();   /**  createNewFile方法创建文件 */

        System.out.println(newFile);
    }

}
