package week1.day1;

public class LatestVersion extends ModuleNumber {
	
	public void module () {
		System.out.println("Test");
	}

	public static void main(String[] args) {
		String brandName = "Audi";
		LatestVersion version = new LatestVersion();

		version.getversion(brandName);
		version.module();
		

	}

}
