package week1.day2;

public class ClassWrok {

	public static void main(String[] args) {

//	Work - 1
		String browserName[] = { "Chrome", "Firefox", "Opera", "IE", "edge"};

		int lastBefore = browserName.length - 2;
		System.out.println(browserName[lastBefore]);

//		Work - 2

		int sum = 0;
		int numberList[] = { 3, 10, 13, 25, 40 };
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] % 2 != 0) {
				sum = sum + numberList[i];
			}
		}
		System.out.println(sum);

		String comName = "Datatracks";
		String varComName = new String("Datatracks");
		System.out.println(comName);
		System.out.println(varComName);

//		Work - 3
		// Method 1
		String text = "I am a self motivator";

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
System.out.println();
		// Mothod 2
		String textWord = "I am a self motivator";
		char[] allwords = textWord.toCharArray();

		for (int i = allwords.length - 1; i >= 0; i--) {
			System.out.print(allwords[i]);

		}
		System.out.println();
		String Sentance = "I am a self motivator";
		String[] Words = Sentance.split(" ");
		System.out.println(Words.length);
		for (int i = Words.length-1; i >= 0; i--) {
			System.out.print(Words[i]+" ");
		}
		


		
		
		
		
	}
}
				

	
