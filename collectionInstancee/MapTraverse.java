package collectionInstancee;

import java.util.TreeMap;

/**
 * 打印 map的全部value 和 key
 */
public class MapTraverse {

    public static void main(String[] args) {

        String [] key={"one","two","three"};

        String [] values={"Chrome","IDEA","WeChat"};

        TreeMap tMap = new TreeMap();

        for(int i=0;i<key.length;i++){
            tMap.put(key[i],values[i]);
        }

        //遍历键
        System.out.println(tMap.keySet());
        //遍历值
        System.out.println(tMap.values());

        //输出键和值
        System.out.println(tMap.entrySet());

    }

}
