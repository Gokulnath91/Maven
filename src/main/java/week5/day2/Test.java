package week5.day2;



public class Test {
	@org.testng.annotations.Test
	public void a() {
		System.out.println("a");
	}
	
	@org.testng.annotations.Test(dependsOnMethods="c")

	public void b() {
		System.out.println("b");
	}
	
	@org.testng.annotations.Test

	public void c() {
		System.out.println("c");
	}
	
	@org.testng.annotations.Test

	public void d() {
		System.out.println("d");
	}
}
