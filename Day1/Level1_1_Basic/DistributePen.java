/*Suppose you have to divide 14 pens among 3 students equally. 
Write a program to find how many pens each student will get if the pens must be divided equally.
 Also, find the remaining non-distributed pens.
*/

public class DistributePen{
	public static void main(String args[]){
		//Number of Pens
		int pens = 14;
		
		//Number of students
		int students = 3;
		
		//Number of pens each student get
		int get_pen = pens/students;
		
		//Number of pens left
		int left_pens = pens%students;
		
		//Number of pens each student get and remaining pens
		System.out.println("The Pen per Student is " + get_pen + " and the remaining pen not distributed is " + left_pens); 
		
		
	}
}