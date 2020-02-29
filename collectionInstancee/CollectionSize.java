package collectionInstancee;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合长度
 */
public class CollectionSize {

    public static void main(String[] args) {

        System.out.println("集合实例\n");

        int size;

        HashSet collection = new HashSet();

        String[] soft = {"Android Studio", "Notepad++", "Postman"};

        for (int i = 0; i < soft.length; i++) {
            collection.add(soft[i]);
        }

        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        size = collection.size();

        if(collection.isEmpty()){
            System.out.println("集合为空");
        }else{
            System.out.println("集合长度:"+size);
        }
    }

}
