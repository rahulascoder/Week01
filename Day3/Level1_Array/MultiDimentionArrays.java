import java.util.*;

public class MultiDimentionArrays {
    public static void main(String[] args) {
        // Creating a scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input for rows and columns
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();

        // Creating 2D array
        int[][] matrix = new int[row][column];

        // Taking user input for 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Creating 1D array of size rows * columns
        int[] array = new int[row * column];
        int index = 0;

        // Copying elements from 2D array to 1D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Displaying the 1D array
        System.out.println("The 1D array is:");
        for (int z = 0; z < array.length; z++) {
            System.out.print(array[z] + " ");
        }

        // Closing the scanner
        sc.close();
    }
}
