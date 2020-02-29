package directoryInstance;

import java.io.File;

/**
 * 判断目录是否为空
 */
public class IsDirectoryAndList {

    public static void main(String[] args) {

        File file=new File("C:\\learning\\idea-java-project\\src\\dateDemo");
        if(file.isDirectory()){
            if(file.list().length>0){
                System.out.println("目录不为空");
            }else{
                System.out.println("目录为空");
            }
        }else{
            System.out.println("这不是一个目录");
        }

    }

}
