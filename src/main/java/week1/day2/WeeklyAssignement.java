package week1.day2;

public class WeeklyAssignement {

	public static void main(String[] args) {
// Question 1
		// Method 1
		String name = "Welcome to Automation world";
		String re = name.replace("e", "");
		System.out.println("Result after eleminating e = " + re);

		// Method 2
		String name1 = "Welcome to Automation world";
		String result = "";
		for (int i = 0; i < name1.length(); i++) {
			char c = name1.charAt(i);
			if (c != 'e') {
				result = result + c;
			}

		}
		System.out.println("Result after eleminating e = " + result);
		
		String name2 = "Welcome to Automation world";
		for(int i=0;i<name2.length();i++)
        {
			char character=name2.charAt(i);
            if(character=='e') break;
            System.out.print(character);
        }
		System.out.println();

		for(int i=0;i<name2.length();i++)
        {
			char character=name2.charAt(i);
            if(character=='e') continue;
            System.out.print("Result after eleminating e = " +character);
        }
		
		
		System.out.println();

// Question 2
		// method 1
		String text = "Amazon India Private Limited";
		int vowels = 0;
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {

			char ch = text.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			}

		}
		System.out.println("Occurance of vowels : " + vowels);

		// method 2
		String sentance = "Amazon India Private Limited";
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		sentance = sentance.toLowerCase();
		for (int j = 0; j < sentance.length(); j++) {

			char cha = sentance.charAt(j);
			if (cha == 'a') {
				++a;
			} else if (cha == 'e') {
				++e;
			} else if (cha == 'i') {
				++i;
			} else if (cha == 'o') {
				++o;
			} else if (cha == 'u') {
				++u;
			}
		}
		System.out.println("Occurance of a : " + a);
		System.out.println("Occurance of e : " + e);
		System.out.println("Occurance of i : " + i);
		System.out.println("Occurance of o : " + o);
		System.out.println("Occurance of u : " + u);

// 	Question 3 
		// Method 1
		String str = "Testleaf is a test factory";
		String insert = "Automation";
		String b = str.substring(0, 19);
		String c = str.substring(18, 26);

		System.out.println("Result after inserting  Automation = " + b + insert + c);
		System.out.println(
				"Result after inserting  Automation = " + str.substring(0, 19) + insert + str.substring(18));

		// Method 2
		String nameL = "Testleaf is a test factory";
		String replace = nameL.replace("test ", "test Automation ");
		System.out.println("Result after inserting  Automation = " + replace);

		// Method 3
		/*
		 * String string = "Testleaf is a test factory"; String insert1 = "Automation";
		 * String leftSide=""; String rightSide=" "; for (int j = 0; j <
		 * string.length(); j++) { char chh=string.charAt(j); if(j<=18) {
		 * leftSide=leftSide+chh; }else rightSide=rightSide+chh;
		 * }System.out.println("Result after inserting  Automation = "
		 * +leftSide+insert1+rightSide);
		 */
		String string = "Testleaf is a test factory";
		String insert1 = "Automation";
		String leftSide = "";
		String rightSide = "";
		for (int j = 0; j < string.length(); j++) {
			char chh = string.charAt(j);
			if (j <= 18) {
				leftSide = leftSide + chh;
			}
			if (j >= 18) {
				rightSide = rightSide + chh;
			}
		}
		System.out.println("Result after inserting  Automation = " + leftSide + insert1 + rightSide);

		// Method 4
		String string1 = "Testleaf is a test factory";
		String insert2 = "Automation";
		String result1 = "";
		
		for (int j = 0; j < string1.length(); j++) {
			
			char chh=string1.charAt(j);
			if (j==string1.length()-8) {
				result1=result1+" "+insert2;
			}
			result1=result1+chh;
			
			
		}System.out.println("Result after inserting  Automation = "+result1);
		
		//Method 5
		String string2 = "Testleaf is a test factory";
		String insert3 = "Automation";
		String result2 = "";
		
		String[] Words = string2.split("\\s");
		
		for (int j = 0; j < Words.length; j++) {
			if(j==Words.length-1) {
				result2=result2+insert3+" "+Words[j];

			}
			else result2=result2+Words[j]+" ";
		}System.out.println("Result after inserting  Automation = "+result2);
		



// Question 4 
		String palindrome = "LeveL";
		String rev = "";
		boolean flag = true;
		for (int k = palindrome.length() - 1; k >= 0; k--) {
			rev = rev + palindrome.charAt(k);

		}
		boolean equals = palindrome.equals(rev);
		if (flag == equals) {
			System.out.println("The given string is a palindrome");

		} else
			System.out.println("The given string is not a palindrome");
		
// Home Work 2
		String[] Names= {"Sankar","Sakthi","ram","Sasi"};
		boolean flag3=true;
		System.out.println("Bewlo are the name starts with 's' and edns with 'i' : ");
			for (int j = 1; j < Names.length; j++) {
		boolean flag1= Names[j].toLowerCase().startsWith("s");
		boolean flag2= Names[j].toLowerCase().endsWith("i");
					
		if (flag3==flag1&&flag3==flag2) {
			System.out.println(Names[j]);
		}
		}
	
// Home Work 1	
		String text1="test";
		byte[] bar = text1.getBytes();
		System.out.println(bar[1]);
		
		for (int j = 0; j < Names.length; j++) {
			
			
			
		}
	
// Home Work 3	
	
		String text2 = "Amazon India Private Limited";
		int occurance = 0;
		text = text.toLowerCase();
		for (int j = 0; j < text2.length(); j++) {

			char ch = text.charAt(i);
			if (ch == 'i') {
				++occurance;
			}

		}
		System.out.println("Occurance of i : " + occurance);

	
	
	
	
	}

}
