import java.util.*;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length(); //Here changing number into string and finding length to get no. of digit 
    }

	// Method to store the digits of the number in a digits array
	
	public static int[] storeDigits(int number) {
	
		number = Math.abs(number); // Ensure the number is positive
		
		int digitCount = (int) Math.log10(number) + 1; // Counting the number of digits
		
		int[] digits = new int[digitCount];
		for (int i = digitCount - 1; i >= 0; i--) {
			digits[i] = number % 10; 
			number /= 10; 
		}
		return digits;
	}

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) { 		//this is for-each loop to traverse each index of array 
            if (digit == 0) {
                return true; 	// Duck number if it has any zero
            }
        }
        return false;
    }


    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
	
        int[] digits = storeDigits(number);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};   //Creating array and throwing two parameter 
    }

    // Main method
    public static void main(String[] args) {
	
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
	
        System.out.println("Enter a  number: ");
		int number = sc.nextInt();

        
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

       
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);

        
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
		
		sc.close();
    }
}
