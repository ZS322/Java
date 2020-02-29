package arrayDemo;

/**
 * 为数组添加间隔逗号
 */
public class ArrayDemoTwo {

    public static void printArray(int [] array){

        for(int i=0;i<array.length;i++){
            if(i<4){
                System.out.print(array[i]+",");
            }else{
                System.out.print(array[i]+"");
            }
        }

    }

    public static void main(String[] args) {


        printArray(new int [] {1,2,3,4,5});

    }


}
