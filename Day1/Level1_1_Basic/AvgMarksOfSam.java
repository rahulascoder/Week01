//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

public class AvgMarksOfSam{
	public static void main(String args[]){
		//Marks of diffrent subjects
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		//Maximum marks in each subject
		int maxMarksPerSubject = 100;

		//Sum of toatal marks
        int totalMarks = maths + physics + chemistry;
		
		//Number of subjects
        int numberOfSubjects = 3;
		
		//Finding average of all marks
        double averagePercentage = (totalMarks / (double)(numberOfSubjects * maxMarksPerSubject)) * 100;

		//Output
        System.out.println("Sam's average percentage in PCM is: " + averagePercentage + "%");
    
	}
}