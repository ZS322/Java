package directoryInstance;

import java.io.File;

/**
 *  获取文件的上级目录
 */
public class GetParentFile {

    public static void main(String[] args) {

        File file = new File("C:\\HeidiSQL\\Backups\\query-tab-2020-01-23_10-32-46-648.sql");
        String parent = file.getParent();
        System.out.println("文件的上级目录为 : " + parent);
    }
}
