package practicePackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ExceptionHandling {

	public static void main(String[] args)  {
		
		
		int i =10;
		
		try{
		
			int a=10;
			int b=5;
			int c = a/b;
			if (c>1) 
				throw Bhuvana() ;
			System.out.println(str);
			int[] array = {1,3,6};
			System.out.println(array[5]);
		int j=i/0;
		System.out.println(j);
		
		}
		
		
		catch(ArithmeticException e   ){
			System.err.println("Error");
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException e ){
			System.err.println("Error");
		
		}
		
		catch (Bhuvana e){
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Success");
		}
		
		//String path = "C:/Users/Admin/Desktop/JavaPractice/src/practicePackage/test.properties";
		
		/*Properties prop = new Properties();*/
		
		
		
		/*rop.load(fs);
		
		System.out.println(prop.getProperty("Name"));
	}
*/
		
		/*System.out.println("Enter the name ");
		
		
		
		try( BufferedReader br=new BufferedReader (new InputStreamReader(System.in));){
			
			  
		
		String s=br.readLine();
		System.out.println(s);
		}
		
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}*/
		
		
		
	}
}
	

