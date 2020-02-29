package genericsDemo;

/**
 * 泛型方法遍历打印
 */
public class GenericMethodTest {

    public static <E> void printArray(E [] inputArray){

        for(E element : inputArray){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        printArray(new String[] {"Chrome离线插件", "MYSQL","IDEA"});

    }
}
