package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeeklyAssignment3 {

	public static void main(String[] args) {

		String InputWithSpace = "PayPal India";
		String Input = InputWithSpace.replace(" ", "");

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
		//int Result = Value.get(Value.size() - 2);
		// System.out.println(Value);
		// System.out.println(Result);

		for (Entry<Character, Integer> c : ListInput.entrySet()) {
			if (Value.get(Value.size() - 2) == c.getValue()) {
				System.out.println("The Second Most Caharatter is : " + c.getKey());
			}
		}

	}
}
