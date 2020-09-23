package practicePackage;

public class RemovingSpace {

	public static void main(String[] args) {
		// using built-in method

		/*
		 * String str1="All is Well";
		 * 
		 * String str2 = str1.replaceAll("\\s+", "");
		 * System.out.println("Original String is : " +str1 );
		 * System.out.println("After removing Spaces : " +str2);
		 */

		String stringWithSpace = "All is well";

		char[] chararray = stringWithSpace.toCharArray();
		String stringWithoutSpaces = "";
		for (int i = 0; i < chararray.length; i++)

		{
			if ((chararray[i] != ' ' )&& (chararray[i] != '\t')) {
				stringWithoutSpaces = stringWithoutSpaces + chararray[i];
			}
		}
		
		System.out.println("Input string is : " +stringWithSpace);
		System.out.println("Input string is : " +stringWithoutSpaces);
		
	}

}
