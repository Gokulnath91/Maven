package week3.day1;

public class Concrete extends AbstractClass{

	public void method3() {
		System.out.println("Method 3");

		
	}

	public void method4(String test) {
		System.out.println("Method 4 Override");

		
	}

	public void method5() {
		System.out.println("Method 5");
		
	}

	public void method2() {
		System.out.println("Method 2");
		
	}
	public static void main(String[] args) {
		Concrete test =new Concrete();
		test.method1();
		test.method2();
		test.method3();
		test.method4();
		test.method5();
		test.method4("t");
	}
	

}
