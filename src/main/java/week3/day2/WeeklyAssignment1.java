package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeeklyAssignment1 {

	public static void main(String[] args) {
		
		
		List<String> Names = new ArrayList<String>();

		Names.add("CTS");
		Names.add("HCL");
		Names.add("Aspire Systems");
		Collections.reverse(Names);

		for (String Name : Names) {
			System.out.println(Name);
		}
		System.out.println("**************");

		Collections.sort(Names);
		Collections.reverse(Names);

		for (String Name : Names) {
			System.out.println(Name);
		}

	}

}
