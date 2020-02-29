package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemoOne {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "valueOne");
        map.put("two", "valueTwo");
        map.put("three", "valueThree");


        for (String key : map.keySet()) {
            System.out.println(key + "===" + map.get(key));
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "===" + next.getValue());
        }


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }


        for(String v : map.values()){
            System.out.println(v);
        }

    }

}
