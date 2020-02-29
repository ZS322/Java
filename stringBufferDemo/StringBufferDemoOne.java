package stringBufferDemo;

public class StringBufferDemoOne {
    public static void main(String[] args) {

        StringBuffer sBuffer=new StringBuffer("直视的电话:");
        sBuffer.append("131");
        sBuffer.append("69");
        sBuffer.append("126919");
        System.out.println(sBuffer);

        StringBuilder sBuilder=new StringBuilder("Hello");
        StringBuilder world = sBuilder.append("World");
        System.out.println(world);
        sBuffer.delete(0,1);
        System.out.println(sBuffer);
        StringBuffer stringBuffer = sBuffer.deleteCharAt(1);
        System.out.println(stringBuffer);
        StringBuffer re = sBuffer.reverse();
        System.out.println(re);

        sBuilder.insert(0,"hello");
        System.out.println(sBuilder);

        //代替
        sBuilder.replace(0,1,"https://www.runoob.com/java") ;
        System.out.println(sBuilder);

        StringBuilder stringBuilder=new  StringBuilder();
        stringBuilder.append(1);
        stringBuilder.append(1);
        stringBuilder.append(1);

        System.out.println(stringBuilder);


    }
}
