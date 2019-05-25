package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ClassWork5 {

	public static void main(String[] args) {
//List
		String input = "Amazon India Pribvated Limited";
		char[] ArreyLis = input.toCharArray();

		Map<Character, Integer> list = new LinkedHashMap<Character, Integer>();

		for (Character c : ArreyLis) {
			int count = 0;
			for (int i = 0; i < ArreyLis.length; i++) {
				if (c == ArreyLis[i]) {
					++count;
				}

			}
			list.put(c, count);

		}

		for (Entry<Character, Integer> re : list.entrySet()) {
			if (re.getValue() > 1)

				System.out.println(re.getKey() + " - " + re.getValue());

		}

	}
}
