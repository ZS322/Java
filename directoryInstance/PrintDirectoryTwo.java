package directoryInstance;

import java.io.File;

/**
 * 输出指定目录下的所有文件
 */
public class PrintDirectoryTwo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        File dir = new File("C:\\software package");
        String[] children = dir.list();

        if (children == null) {
            System.out.println("目录不存在或它不是一个目录");
        } else {
            for (int i = 0; i < children.length; i++) {

                if (children[i].endsWith("zip")) {
                    sb.append(children[i]+"\n");
                }
            }
        }

        System.out.println(sb);
    }

}
