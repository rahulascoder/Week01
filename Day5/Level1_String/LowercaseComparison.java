import java.util.Scanner;

public class LowercaseComparison {

    
    public static String convertToLowerCaseUsingCharAt(String input) {
		
        StringBuilder lowerCaseText = new StringBuilder();
		
        for (int i = 0; i < input.length(); i++) {
			
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
		
        String lowerCaseUsingBuiltIn = userInput.toLowerCase();

        String lowerCaseUsingCustomMethod = convertToLowerCaseUsingCharAt(userInput);

        // Compare both results
        boolean isSame = compareStrings(lowerCaseUsingBuiltIn, lowerCaseUsingCustomMethod);

        // Display 
        System.out.println("Lowercase using built-in method: " + lowerCaseUsingBuiltIn);
        System.out.println("Lowercase using custom method: " + lowerCaseUsingCustomMethod);
        System.out.println(nAre the two results the same? " + isSame);

        scanner.close();
    }
}
