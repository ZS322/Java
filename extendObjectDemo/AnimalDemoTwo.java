package extendObjectDemo;

public class AnimalDemoTwo {

	private String name;
	private int id;

	public AnimalDemoTwo(String myName, String myid) {
		// 初始化属性值
	}

	public void eat() {
		// 吃东西方法的具体实现
	}

	public void sleep() {
		// 睡觉方法的具体实现
	}

}

class PenguinTwo extends AnimalDemoTwo {

	public PenguinTwo(String myName, String myid) {
		super(myName, myid);

	}
}