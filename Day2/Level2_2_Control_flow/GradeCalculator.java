import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
		
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
		
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        // Compute total marks, average, and percentage
        int totalMarks = physics + chemistry + maths;
        float percentage = (totalMarks / 3.0f);

        // Determine grade and remarks
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalization standards";
        } else if (percentage >= 70 ) {
            grade = "B";
            remarks = "Level 3, at agency-normalization standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below,but approaching agency-normalization standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalization standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level -1, too below agency-normalization standards";
        } else {
            grade = "F";
            remarks = "Remedial standards";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
