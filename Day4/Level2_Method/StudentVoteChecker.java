import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
	
		//creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//Creating object to call method
        StudentVoteChecker voteChecker = new StudentVoteChecker();
		
        int[] studentAges = new int[10]; // Array to store ages of 10 students

        System.out.println("Enter the age of 10 students:");

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt(); 
        }

        System.out.println("Voting Eligibility Results:");
		
        for (int i = 0; i < studentAges.length; i++) {
		
			
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
			
            if (studentAges[i] < 0) {
                System.out.println("Student " + (i + 1) + " has an invalid age (" + studentAges[i] + "). Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is not eligible to vote.");
            }
        }

        sc.close();
    }
}
