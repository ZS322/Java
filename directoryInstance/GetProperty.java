package directoryInstance;

import java.io.File;
import java.util.Properties;

/**
 *  查看当前工作目录
 */
public class GetProperty {

    public static void main(String[] args) {

        String curDir = System.getProperty("user.dir");
        System.out.println(curDir);

//        File file=new File(curDir+"\\src");
//        File[] files = file.listFiles();
//        for(File f: files ){
//            System.out.println(f.getName());
//        }

        Properties p=new Properties();

    }

}
