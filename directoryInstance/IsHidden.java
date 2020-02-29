package directoryInstance;

import java.io.File;

/**
 * 判断文件是否隐藏
 */
public class IsHidden {

    public static void main(String[] args) {

        File file=new File("C:\\learning\\idea-java-project\\src\\dateDemo\\DateDemoOne.java");
        System.out.println(file.isHidden());
    }

}
