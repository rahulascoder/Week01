import java.util.*;

public class CompareString{

	//Creating method to compare two method 
	
	public static boolean comparisonUsingCharAt(String str1 , String str2){
		
		
		if( str1.length() != str2.length()){
		
			return false;
		}
				
		for(int i=0; i<str1.length(); i++){
				
			if( str1.charAt(i) != str2.charAt(i)){
				return false;
			}
				
		}	
		return true;
	}

	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		//Taking input
		System.out.println("Enter first string: ");
		String str1 = sc.next();
		
		System.out.println("Enter second string: ");
		String str2 = sc.next();
		
		//Comparision using chatAt method	
		boolean compare = comparisonUsingCharAt(str1 ,str2);
		
		//Comparision using built-in method
		boolean comareUsingBuiltin = str1.equals(str2);
		
		//Comparing result of both the outcomes
		if(compare == comareUsingBuiltin){
			System.out.println("Both the methods are giving  same result: ");
		
		}else System.out.println("Both the methods are not giving same result: ");
		
		sc.close();
	
	}

}