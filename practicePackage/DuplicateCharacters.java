package practicePackage;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String inputstring = "Bollywood";
		DuplicateCharacters obj = new DuplicateCharacters();

		obj.duplicateCharMethod(inputstring);

	}

	private void duplicateCharMethod(String input){
		
		HashMap<Character,Integer> dupmap = new HashMap<Character,Integer> ();
		
		char[] chararry = input.toCharArray();
		
		for(char ch : chararry){
			
			if(dupmap.containsKey(ch)){
				
				dupmap.put(ch, dupmap.get(ch)+1);
			}
			else{
				dupmap.put(ch, 1);
			}
			


		}
		
		System.out.println("The entries are " +dupmap);
		
		Set<Character> charSet = dupmap.keySet();
		
	    for(Character c :charSet ) {
	    	
	    	if(dupmap.get(c)>1){
	    		System.out.println(c + ":" + dupmap.get(c) );
	    	}
	    }
			
			
			
		}

}
