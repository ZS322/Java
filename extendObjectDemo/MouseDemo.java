package extendObjectDemo;

/**
 * 重写父类的方法
 */
public class MouseDemo extends AnimalDemo{
    public MouseDemo(String myName, int myid) {
        super(myName, myid);
        System.out.println("11112312");
    }

    public void test(){
        System.out.println("mous"+"子类");
    }

    public void eat() {
        System.out.println( "正在吃"+"子类");
    }

}
