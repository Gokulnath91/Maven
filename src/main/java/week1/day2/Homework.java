package week1.day2;

public class Homework {

	public static void main(String[] args) {

		String comapnyName ="Gokul wroking in Datatracks";
		String cName = new String ("Aboo is working in Datatracks");
		
		System.out.println(comapnyName);
		System.out.println(cName);
		int len = comapnyName.length();
		System.out.println(len);
		System.out.println(comapnyName.length());
		
		char Char = comapnyName.charAt(8);
		System.out.println(Char);
		System.out.println(comapnyName.charAt(9));
		
		boolean Check = comapnyName.contains("Datatracks");
		System.out.println(Check);
		System.out.println(comapnyName.equals("Gokul wroking in Datatracks"));
		
		boolean startsWith = comapnyName.startsWith("Go");
		System.out.println(startsWith);
		System.out.println(comapnyName.startsWith("Test"));
		
		


		
				
	}

}
	