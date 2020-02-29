package leetCodeDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int[] number = {0, 1, 2, 3, 4};

        for (int i = 0; i < nums.length; i++) {

            if (i < 5) {
                nums[i] = number[i];
            } else {
                break;
            }
        }

        for (Integer i : nums) {
            System.out.print(i);
        }

    }


}
