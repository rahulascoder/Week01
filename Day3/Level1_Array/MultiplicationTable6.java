import java.util.*;

public class MultiplicationTable6{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking Input 
		int number = sc.nextInt();
		
		//Taking input array
		int multiplicationResult[] = new int[10];
		
		if(number>=6 && number<=9){
			
			for(int i=0; i<10; i++){
				
				multiplicationResult[i] = number*(i+1);
				
				System.out.println(number+" * " +(i+1)+" = " + multiplicationResult[i]);
			}
		}else System.exit(0);
		
		sc.close();
	}

}