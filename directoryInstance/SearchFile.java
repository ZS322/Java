package directoryInstance;

import java.io.File;

/**
 * 使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表
 */
public class SearchFile {

    public static void main(String[] args) {
        File dir = new File("C:\\HeidiSQL");
        String[] children = dir.list();
        if(children==null){
            System.out.println("该目录不存在");
        }else{
            for(int i=0;i<children.length;i++){
                String fileName = children[i];
                System.out.println(fileName);
            }
        }
    }
}
