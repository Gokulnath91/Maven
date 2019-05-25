package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	public void ReverseOrder() {
		List<String> Names = new ArrayList<String>();
		System.out.println("**** Question 1 ****");
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

	public void UniqueCharacter() {
		
	String InputWithSpace = "PayPal India";
	String Input = InputWithSpace.replace(" ", "");
	System.out.println("**** Question 2 ****");

	char[] character = Input.toCharArray();
	Map<Character, Integer> ListInput = new LinkedHashMap<Character, Integer>();
	for (char ch : character) {

		if (ListInput.containsKey(ch)) {
			int value = ListInput.get(ch);
			ListInput.put(ch, value + 1);

		} else

			ListInput.put(ch, 1);

	}
System.out.println("The Unique Character in the given string is below:");
	for (Entry<Character, Integer> c : ListInput.entrySet()) {
		if (c.getValue() == 1) {
			System.out.print(c.getKey());
		}

	}

}
	
	public void SecondMostCharacter() {
		String InputWithSpace = "PayPal India";
		String Input = InputWithSpace.replace(" ", "");
		System.out.println();
		System.out.println("**** Question 3 ****");
		char[] character = Input.toCharArray();
		Map<Character, Integer> ListInput = new LinkedHashMap<Character, Integer>();
		List<Integer> Value = new ArrayList<Integer>();
		for (char ch : character) {

			if (ListInput.containsKey(ch)) {
				int value = ListInput.get(ch);
				ListInput.put(ch, value + 1);

			} else

				ListInput.put(ch, 1);

		}

		for (Entry<Character, Integer> c : ListInput.entrySet()) {

			// System.out.println(c.getKey()+" - "+c.getValue());
			if (Value.contains(c.getValue())) {

			} else
				Value.add(c.getValue());
		}
		Collections.sort(Value);
		int Result = Value.get(Value.size() - 2);
		// System.out.println(Value);
		// System.out.println(Result);

		for (Entry<Character, Integer> c : ListInput.entrySet()) {
			if (Result == c.getValue()) {
				System.out.println("The Second Most Caharatter is : " + c.getKey());
			}
		}		
		
		
	}



		
}
