import java.util.*;

public class Substring{

	//Creating method to compare two method 
	
	public static String subStringUsingCharAt(String str ,int startIndex,  int endIndex){
		
        String substring="";
				
		for(int i=startIndex; i<=endIndex; i++){
			
			 substring+= str.charAt(i);
		}	
		
		return substring;
	}
	
	public static boolean comparision ( String substringCharAt, String substringBuiltin ){
		
		if(substringBuiltin.equals(substringCharAt)){
			return true;
		}
		return false;
	}

	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
		
		//Taking input
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
	    //Input start and end indexes
		System.out.println("Enter start index of substring: ");
		int startIndex = sc.nextInt();
		
		System.out.println("Enter end index of substring: ");
		int endIndex = sc.nextInt();
		
		//Substring using charAt method
		String substringCharAt = subStringUsingCharAt(str, startIndex, endIndex);
		
		//Substring using built-in method
		
		String substringBuiltin = str.substring(startIndex, endIndex+1);
		
		boolean compare = comparision( substringCharAt, substringBuiltin );

		
		System.out.println("Substring using charAt method is  : "+ substringCharAt);
		System.out.println("Substring using built-in method is : "+ substringBuiltin);
		System.out.println("Equality of both string is  : "+ compare);
		
		
		
		sc.close();
	
	}

}