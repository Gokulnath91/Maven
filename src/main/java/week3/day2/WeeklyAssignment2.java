package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WeeklyAssignment2 {

	public static void main(String[] args) {
		String InputWithSpace = "PayPal India";
		String Input = InputWithSpace.replace(" ", "");

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
}
