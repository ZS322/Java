package interfaceDemo;

/**
 * 实现类实现接口的方法
 */
public class MammalInt implements Animal{

    @Override
    public void test() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void travel() {

    }

    public static void main(String[] args) {

        MammalInt mammalInt = new MammalInt();
        mammalInt.eat();
    }
}
