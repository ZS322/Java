package extendObjectDemo;

/**
 * 多态的形式创建对象并调用子类的方法
 */
public class TestDemo extends DemoImpl{

    public static void main(String[] args) {

        AnimalDemo zs = new MouseDemo("zs", 1);
        zs.eat();
//        zs.test();
        DemoImpl testDemo = new TestDemo();
		testDemo.show();
    }

}
