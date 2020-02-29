package directoryInstance;

import java.io.File;

/**
 * 递归创建目录
 */
public class FileMkdirs {

    //使用 File 类的 mkdirs() 实现递归创建目录
    public static void main(String[] args) {

        //指定路径
        String CreateDirectories="c:/learning/test/tst";

        File file=new File(CreateDirectories);
        boolean mkdirs = file.mkdirs(); //创建多个目录
        System.out.println(mkdirs);

    }

}
