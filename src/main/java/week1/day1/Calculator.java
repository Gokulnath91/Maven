package week1.day1;

public class Calculator {
	public static void main(String[] args) {
		int a = 15, b = 7, choice = 3;
		Arthimetic myCalculator = new Arthimetic();
		System.out.println("Additon result " + myCalculator.add(a, b));
		System.out.println("Subration result " + myCalculator.sub(a, b));
		System.out.println("Divition result " + myCalculator.divide(a, b));
		System.out.println("Multiplication result " + myCalculator.mul(a, b));
		switch (choice) {
		case 1:
			System.out.println("Additon result " + myCalculator.add(a, b));
			break;
		case 2:
			System.out.println("Subration result " + myCalculator.sub(a, b));
			break;
		case 3:
			System.out.println("Divition result " + myCalculator.divide(a, b));
			break;
		case 4:
			System.out.println("Multiplication result " + myCalculator.mul(a, b));
			break;
		default:
			break;
		}

//1.Find the given number is prime or not

		int number = 17;
		boolean flag = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(number + " is a prime number");
		} else 	
			System.out.println(number + " is not a prime number");

//2. Greatest of 3 numbers

		int n1 = 4, n2 = 2, n3 = 3;
		if (n1 >= n2 && n1 >= n3) {
			System.out.println(n1 + " is the greatest number");

		} else if (n2 >= n3 && n2 >= n1) {
			System.out.println(n2 + " is the greatest number");

		} else
			System.out.println(n3 + " is the greatest number");

//3.Sum of 1 to 100

		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			sum = sum + num;
		}
		System.out.println("sum of 1 to 100 = " + sum);

// 4.If number is 1 print Monday.

		int num = 3;
		switch (num) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Thuseday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Holiday");
			break;
		}

	}

}
