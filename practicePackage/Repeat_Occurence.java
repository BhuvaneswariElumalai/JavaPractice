package practicePackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repeat_Occurence {

	public static void main(String[] args) {
		
		String input = "All is well here";
		
		Repeat_Occurence obj = new Repeat_Occurence();
		
		HashMap<Character,Integer> resultHashMap =obj.occurenceMethod(input);
		System.out.println("The Occurences are : " +resultHashMap);
		

	}
private HashMap<Character,Integer> occurenceMethod(String inputstring){
	
	HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
	
	char[] inputarray = inputstring.toCharArray();
	
	for(int i=0;i<inputarray.length;i++){
		
		if(hashmap.containsKey(inputarray[i])){
			hashmap.put(inputarray[i], hashmap.get(inputarray[i])+1);
		}
		else{
			hashmap.put(inputarray[i], 1);
		}
	}
	
	/*Set<Character> setValues = hashmap.keySet();
	
	for (Character value : setValues){
		
		if(hashmap.get(value)>1){
			System.out.println( value  + " : " + hashmap.get(value));
		}
	}*/
	
	/*
	for(Map.Entry<Character,Integer> values : hashmap.entrySet() )
	{
		Character keyValue = values.getKey();
		Integer valueOutput = values.getValue();
		
		System.out.println(keyValue +" : " + valueOutput );
	}
	
	
	for( Character key : hashmap.keySet()){
		
		Integer value = hashmap.get(key);
		
		System.out.println(key +" : " + value );
		
	}*/
	return hashmap;
	
	
	
}

}
