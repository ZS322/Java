package extendObjectDemo;

public interface ImplementsAndInterFaceDemo {

	public void eat();

	public void sleep();

}

interface InterfaceOne {
	public void show();
}

class DemoImpl implements ImplementsAndInterFaceDemo, InterfaceOne {

	public void show() {
		System.out.println("Hello");
	}

	public void eat() {
		System.out.println("测试");
	}

	public void sleep() {
		System.out.println("one");
	}

}