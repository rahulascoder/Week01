import java.util.Scanner;

public class UppercaseComparison {

    // Converting text to uppercase using charAt() and ASCII values
    public static String convertToUpperCaseUsingCharAt(String input) {
		
        StringBuilder upperCaseText = new StringBuilder();
		
        for (int i = 0; i < input.length(); i++) {
			
            char ch = input.charAt(i);
			
            if (ch >= 'a' && ch <= 'z') {
                
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        
        String upperCaseUsingBuiltIn = userInput.toUpperCase();

        
        String upperCaseUsingCustomMethod = convertToUpperCaseUsingCharAt(userInput);

        
        boolean isSame = compareStrings(upperCaseUsingBuiltIn, upperCaseUsingCustomMethod);

        // Display results
        System.out.println("\nUppercase using built-in method: " + upperCaseUsingBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseUsingCustomMethod);
        System.out.println("\nAre the two results the same? " + isSame);

        scanner.close();
    }
}
