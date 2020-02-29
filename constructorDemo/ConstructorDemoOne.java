package constructorDemo;

public class ConstructorDemoOne {

	public static void main(String[] args) {
			
		
		System.out.println("----SubClass类继承------");
		
		SubClass sc1=new SubClass();
		SubClass sc2=new SubClass(123);
		
		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(312);
	}

}

class SuperClass {

	private int n;

	/** 无参构造器 */
	SuperClass() {
		System.out.println("SuperClass ()");
	}

	SuperClass(int n) {
		System.out.println("SuperClass (int n)");
		this.n = n;
	}

}

class SubClass extends SuperClass{

	private int n;
	
	// 自动调用父类的无参数构造器
	SubClass() { 
		System.out.println("SubClass");
	}

	public SubClass(int n) {
		super(3000);
		System.out.println("SubClass(int n):" + n);
		this.n = n;
	}
	
}


class SubClass2 extends SuperClass{

	private int n;
	
	// 自动调用父类的无参数构造器
	SubClass2() { 
		super(300);  // 调用父类中带有参数的构造器
		System.out.println("SubClass");
	}

	public SubClass2(int n) {
		System.out.println("SubClass(int n):" + n);
		this.n = n;
	}
	
}




