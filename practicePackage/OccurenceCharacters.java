package practicePackage;

import java.util.HashMap;

public class OccurenceCharacters {

	public static void main(String[] args) {
		
		String str1 = "All is well";
		charCount(str1);
		
		
	}
		
	private static void charCount(String input){
		//creating hashmap to store key value pairs
		HashMap<Character,Integer> charHashMap = new HashMap<Character,Integer>();
		
		//convert the string to chararray
		char[] chararray = input.toCharArray();
		
// checking if each char value is in the hashmap
				
				for(char value : chararray)
				{
				if(charHashMap.containsKey(value))
					
				{
					charHashMap.put(value, charHashMap.get(value)+1);
				}else{
					charHashMap.put(value,1);
				}
	}

		System.out.println("The entries in the hashmap are : "  +charHashMap);
	}	
}
