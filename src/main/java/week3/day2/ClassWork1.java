package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClassWork1 {

	public static void main(String[] args) {
//List
		String input = "Infosys Limited";
		char[] ArreyLis = input.toCharArray();

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < ArreyLis.length; i++) {
			boolean b = list.contains(ArreyLis[i]);
			list.add(ArreyLis[i]);
			// System.out.println(b);
			if (b == true) {
				System.out.print(ArreyLis[i] + ", ");
			}

		}

		System.out.println();
//set
		Set<Character> setList = new LinkedHashSet<Character>();
		for (int i = 0; i < ArreyLis.length; i++) {

			if (setList.add(ArreyLis[i]) == false) {
				System.out.print(ArreyLis[i] + ", ");
			}

		}

	}

}
