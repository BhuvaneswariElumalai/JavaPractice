package practicePackage;

public class StringReverseWords {

	public static void main(String[] args) {

		String str1 = "This is a string";
		String resultstring = stringReverse(str1);
		System.out.println(resultstring);
	}

	public static String stringReverse(String str1) {

		String reverse = "";
		
		if(str1.isEmpty() || str1==null ){
			System.out.println("Please enter a valid String");
		}

		if (str1.length() == 1) {

			return str1;
		} else {

			String[] strarray = str1.split("\\s+");
			for (int i = 0; i < strarray.length; i++) {

				reverse = strarray[i] + " " + reverse;

			}

		}
		return reverse;

	}

}
