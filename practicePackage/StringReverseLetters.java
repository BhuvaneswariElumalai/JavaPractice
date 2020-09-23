package practicePackage;

import java.util.Scanner;

public class StringReverseLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the String");
		String input = scan.nextLine();
		System.out.println(input);

		while (input.isEmpty() || input == null) {
			System.out.println("Please enter a valid String");
			input = scan.nextLine();
		}
		scan.close();
		
		StringBuilder obj = new StringBuilder(input);
		System.out.println("The reversed string is " + obj.reverse());
		
		/*StringReverseLetters obj = new StringReverseLetters();

		String result = obj.stringReverse(input);

		System.out.println(result);*/
	}

	private String stringReverse(String inputStr) {
		String reverse = "";

		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverse = reverse + inputStr.charAt(i) ;
		}

		return reverse;

	}
}
