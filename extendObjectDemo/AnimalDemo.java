package extendObjectDemo;

/**
 * 继承父类
 */
public class AnimalDemo {
    private String name;
    private int id;

    public AnimalDemo(String myName, int myid) {
        name = myName;
        id = myid;
        System.out.println("sdsd");

    }

    public void eat() {
        System.out.println(name + "正在吃"+"父类");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void introduction() {
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }

    private void privateMethod(){
        System.out.println("父类私有方法");
    }



}
