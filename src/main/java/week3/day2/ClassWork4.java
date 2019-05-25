package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassWork4 {

	public static void main(String[] args) {
//List
		String input = "Infosys Limited";
		char[] ArreyLis = input.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character character : ArreyLis) {

			if (list.contains(character)) {

			} else
				list.add(character);

		}
		System.out.println(list);

		// System.out.println();
//set
		Set<Character> setList = new LinkedHashSet<Character>();

		for (Character character : ArreyLis) {
			if (setList.add(character) == true) {
				System.out.print(character);
			}
		}

	}

}
