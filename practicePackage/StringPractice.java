package practicePackage;

public class StringPractice {

	public static void main(String[] args) {
		String s1="Cables";
		String s2 = "Cable";

		int a = stringOccurence(s1,s2);
		if (a == 0) {
			System.out.println("Characters are NOT present");
		}
	}

	public static int stringOccurence(String s1, String s2) {
		char[] cArray1 = s1.toCharArray();
		int length1 = cArray1.length;
		char[] cArray2 = s2.toCharArray();
		int length2 = cArray2.length;
		int a = 0;
		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++) {
				char result = s1.charAt(i);

				if (result == s2.charAt(j)) {
					System.out.println(s1.charAt(i) + " is present");
					
					a++;

				}
				
			}
          
		}
		return a;
	}

}


/*string a="bcd";
string b="abcsgd";
string a="ahji";
string b="sdvfh"
output=false*/