package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassWork3 {

	public static void main(String[] args) {
//List
		String input = "Infosys Limited";
		char[] ArreyLis = input.toCharArray();

		List<Character> list = new ArrayList<Character>();

		for (Character character : ArreyLis) {

			if (list.contains(character)) {
				System.out.println(character);
			}
			list.add(character);

		}

//set
		Set<Character> setList = new LinkedHashSet<Character>();

		for (Character character : ArreyLis) {
			if (setList.add(character) == false) {
				System.out.println(character);
			}
		}

	}

}
