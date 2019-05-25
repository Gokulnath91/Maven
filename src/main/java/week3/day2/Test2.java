package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 extends Test {

	public static void main(String[] args) {
		/*Test2 Result = new Test2();
		Result.ReverseOrder();
		Result.UniqueCharacter();
		Result.SecondMostCharacter();
		*/
		List<Integer> Price = new ArrayList<Integer>();
		Price.add(458);
		Price.add(545);
		Price.add(1750);
		Price.add(1689);
		Collections.sort(Price);
		Integer max = Collections.max(Price);
		System.out.println(max);
		System.out.println(Price);
		
	}

}
