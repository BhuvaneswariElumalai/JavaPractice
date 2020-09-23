package practicePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<String> aList = new ArrayList<String>();
		
		System.out.println("Do you want to enter details Y/N");
		
		Scanner scan = new Scanner(System.in);
		
		boolean done = false;
		
		while(scan.hasNext() && !done){
			
			String input1=scan.next();
			
			if(input1.equalsIgnoreCase(('Y') || ('N'))){
				
			}
			
		}
		
		//Person obj = new Person("Bhuvana",007,"Indian")
	}

}
