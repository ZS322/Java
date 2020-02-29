package printG;

import java.util.Random;

/**
 * @author zhishi
 * @deprecated
 * 九九乘法表
 */
public class ChenFaTWo {

    public static void main(String[] args) {

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"x"+i+"="+j*i+"\t");
            }
            System.out.println();
        }

        int a[] = {6,3,8,2,9,1};
        int length = a.length-1;    //5次
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <length-i; j++) {

            }
        }
        Random random = new Random();

    }
}
