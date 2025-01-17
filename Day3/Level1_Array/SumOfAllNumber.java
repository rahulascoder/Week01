import java.util.*;

public class SumOfAllNumber{
	public static void main(String args[]){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking array input 
		double arr[] =  new double[10];
		
		
		int count = 0;
		double sum = 0.0;
		int i =0;
		while(true){
			    if (count >=10){
				break;
			    }
				arr[i] = sc.nextDouble();
				if(arr[i] <= 0 ){
					break;
				}else {
					sum += arr[i];
					count++;
				}
				

			
		}
		System.out.println("Total value is " +sum);
	}
}