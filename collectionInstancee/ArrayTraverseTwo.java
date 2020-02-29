package collectionInstancee;

import java.util.*;

public class ArrayTraverseTwo {

    public static void main(String[] args) {

        String[] soft = {"百度云盘", "驱动精灵", "因特尔显卡驱动"};

        setTraverse(soft);

//        listTraverse(soft);

    }

    /** set集合遍历 */
    private static void setTraverse(String [] data) {

        Set<String> set = new HashSet<String>();

        for(String content:data){
            set.add(content);
        }

        /** iterator遍历set集合 */
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=============");
        /** foreach循环遍历set集合 */
        for(String result: set){

            System.out.println(result);

        }
    }

    private static void listTraverse(String [] data) {

        List<String> list = new LinkedList<>();

        for(String content:data){
            list.add(content);
        }

        /** iterator遍历set集合 */
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("====");
        /** foreach循环遍历set集合 */
        for(String result: list){
            System.out.println(result);
        }
        System.out.println("====");
        /** list.size()索引遍历 */
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}
