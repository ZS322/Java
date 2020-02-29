package directoryInstance;

import java.io.File;

/**
 * 使用 File 类的 file.getName() 和 file.listFiles() 方法来打印目录结构：
 */
public class PrintDirectory {

    public static void main(String[] args) throws Exception {

        File file=new File("C:\\learning\\big");
        File[] files = file.listFiles();

        StringBuffer sb=new StringBuffer();

        for(File f:files){

            String name = f.getName();
            System.out.println(name);
            String[] list = f.list();
            for(String s: list){
                System.out.println(s);
            }
            sb.append(name+"\n");
        }


    }

}
