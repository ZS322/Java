package superAndThisDemo;

class Animal {
	void eat() {
		System.out.println("animal : eat");
	}
}

class Dog extends Animal {
	
	void eat() {
		System.out.println("dog : eat");	//重写了父类的方法
	}
	
	//自己私有的方法
	void eatTest() {
		this.eat(); // this 调用自己的方法
		
		super.eat(); // super 调用父类方法
	}
}

public class DemoSuperAndThis {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();	//打印父类的方法
		Dog d = new Dog();	
		d.eatTest();	//自己独有的方法
	}
	
}
