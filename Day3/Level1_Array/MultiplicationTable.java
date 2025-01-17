import java.util.*;

public class MultiplicationTable6{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking Input 
		int number = sc.nextInt();
		
		int multiplicationResult[] = new int[];
		
		
		for(int i=0; i<10; i++){
			
			multiplicationResult[i] = number*i;
			System.out.prinln(number+" * " +i+" = " + multiplicationResult[i]);
		}
	}

}