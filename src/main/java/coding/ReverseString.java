package coding;

import org.testng.annotations.Test;

public class ReverseString extends BaseTestNg{
	//	String data = "Testleaf";
	String data ="Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company"
			+ "Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company"
			+ "Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company"
			+ "Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company"
			+ "Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company"
			+ "Examples of big in a Sentence. a big glass of soda She moved to a bigger city. the biggest city in the state He led a big group through the museum. She works for a big company";
	
	// Using StringBuilder class
	@Test(priority=1)
	public void reverseUsingStringBuilder() {		 
		/*StringBuilder input = new StringBuilder(data);
		System.out.println(input.reverse());*/
		System.out.println(new StringBuilder(data).reverse());
	}

	// Using character array
	@Test(priority=2)
	public void reverseUsingCharacter() {		 
		char[] chr = data.toCharArray();
		for (int i = chr.length-1; i>=0; i--)
			System.out.print(chr[i]);
		System.out.println();
	}

	// Using character position
	@Test(priority=3)
	public void reverseUsingCharAt() {		 
		for (int i = data.length()-1; i>=0; i--)
			System.out.print(data.charAt(i));		
		System.out.println();
	}
}





