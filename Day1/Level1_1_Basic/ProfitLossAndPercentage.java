//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.
import java.util.*;

public class ProfitLossAndPercentage{
	public static void main(String args[]){
		
		//Cost price of an article
		int cost_price = 129;
		
		//Selling price of an article
		int selling_price = 191;
		
		//Profit
		int profit = selling_price - cost_price;
		
		//Profit percentage 
		double profit_percentage = profit/(double)cost_price*100;
		
		double profit_percentage_rounded = Math.round(profit_percentage*100.0)/100.0;
		
		//Output 
		System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage_rounded);
		
		
		
	}
}