package leetCodeDemo;

import java.util.ArrayList;
import java.util.List;

public class Test3{


    // E 泛型方法 包装类型  数组
    public static <E> void printArray(E [] inputArray){

        System.out.println(inputArray.length);

    }

    //泛型类   任意参数 涵盖 对象 集合 数组(包装类/基本类型) 引用类型
    public static <T> T methodT(T data){
        return data;
    }

    public static void methodFan(List<?> data){

        System.out.println(data.size());

    }

    public static void main(String[] args) {

        printArray(new Integer [] {112,3});

        Byte [] b=new Byte[]{65,66,67};

        Character [] c1=new Character[]{'A','B','C'};
//
//        printArray(b);
        Test2 ob2 = new Test2();
        Test2 test2 = methodT(ob2);
        test2.setData("He");
        Object data = test2.getData();
        System.out.println(data);

        String[] str = methodT(new String[]{"123", "123"});
        System.out.println(str[0]);

        Character[] characters = methodT(c1);
        System.out.println(characters.length);

        List<Test2> da= new ArrayList();
        da.add(new Test2("one"));
        da.add(new Test2("one"));

        methodFan(da);

        List<Byte> da2= new ArrayList();

        methodFan(da2);

        methodT(da2);

        methodT(new int [] {1,2});

    }

}
