package OverrideDemo;

public class OverrideDemo{

    public static void main(String[] args) {

        Animal a=new Animal();  //Animal对象
        Animal b=new Dog();     //Dog对象

        a.move();   // 执行 Animal 类的方法
        b.move();   //执行 Dog 类的方法

    }

}

class Animal{
    void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    @Override
     void move() {
        System.out.println("狗可以跑");
    }

    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

