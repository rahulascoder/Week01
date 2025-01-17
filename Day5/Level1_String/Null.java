import java.util.*;
import java.lang.Exception;

 class Null{

	//Creating method to demonstrate NullPointerException
	
	public static void generateNullPointerException(){
		
		//try and catch block
		 
		try{
			//Calling a string method to invoke exception
			String str = null;
			System.out.println(str.length());
			
			
		}
		catch(NullPointerException e){
			
			//e.generateNullPointerException();
			System.out.println("NullPointerException =>"+e.getMessage());
		}catch (Exception u){
			System.out.println("Exception occured");
		}
 
	}
	
	
	public static void main(String args[]){
	
		//Calling method to generate exceptions
		generateNullPointerException();
		
	}

}