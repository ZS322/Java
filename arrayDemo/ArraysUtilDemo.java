package arrayDemo;

import java.util.Arrays;

/**
 * Arrays工具类实现数组排序与二分法查找
 */
public class ArraysUtilDemo {

    public static void main(String[] args) {

        int [] intArr={7,8,9,5,4,3};

        //自然顺序进行升序排列1
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        //二分法查找
        int targetIndex = Arrays.binarySearch(intArr, 9);
        System.out.println(targetIndex);

    }

}
