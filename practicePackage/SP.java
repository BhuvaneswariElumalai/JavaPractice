package practicePackage;

public class SP {

	public static void main(String[] args) {
		String s1 = "ko";
		String s2 = "cable";

		char[] cArray = s1.toCharArray();
		int length = cArray.length;

		for (int i = 0; i < length; i++) {

			char result = s1.charAt(i);

			if (result == ('k' | 'o')) {
				System.out.println("The characters are present");
			} else {

				System.out.println("The characters are not present");
			}

		}

	}
}