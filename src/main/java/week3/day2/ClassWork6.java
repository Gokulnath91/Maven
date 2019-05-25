package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ClassWork6 {

	public static void main(String[] args) {
//List
		String input = "Amazon India Pribvated Limited";
		char[] ArreyLis = input.toCharArray();

		Map<Character, Integer> list = new LinkedHashMap<Character, Integer>();
		for (char c : ArreyLis) {

			if (list.containsKey(c)) {
				int value = list.get(c);
				list.put(c, value + 1);

				} else
				list.put(c, 1);

		}

		for (Entry<Character, Integer> re : list.entrySet()) {
			if (re.getValue() > 1)

				System.out.println(re.getKey() + " - " + re.getValue());

		}

	}
}
