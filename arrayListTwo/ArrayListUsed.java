package arrayListTwo;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListUsed {

    public static void main(String[] args) {

        List list = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println(list.get(0) + "  " + list.get(2));

        Integer [] myArray={1,2,3};
        List listTwo = Arrays.stream(myArray).collect(Collectors.toList()); /** 使用JAVA8 的Stream(推荐)*/

        System.out.println("删除前:"+listTwo);
        Iterator iterator = listTwo.iterator();
        while (iterator.hasNext()){

            Object next = iterator.next();
            System.out.println(next);
//            iterator.remove();
            if(next.equals(2)){
                listTwo.remove(next);
            }
        }
        System.out.println(listTwo);
        BigDecimal a = new BigDecimal("1.0");
        /**返回 -1 表示小于，0 表示 等于， 1表示 大于 */

        int i = a.compareTo(new BigDecimal("0.9"));

        System.out.println(i);

        String target="ull";
        if("target".equals(target)){
            System.out.println("正确");
        }

        if(Objects.equals(null, target)){
        }



    }

}
