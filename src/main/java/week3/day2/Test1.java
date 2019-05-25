package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		String InputWithSpace = "PayPal India";
		String Input = InputWithSpace.replace(" ", "");

		char[] character = Input.toCharArray();
		List<Character> Collection = new ArrayList<Character>();
		List<Character> Check = new ArrayList<Character>();
		
		for (Character Char : character) {
			if(Collection.contains(Char)|| Check.contains(Char)) {
				Collection.remove(Char);
				Check.add(Char);
			}else Collection.add(Char);
			
		}
		for (Character Result : Collection) {
			System.out.print(Result);
		}
		
		
		
	}
}
