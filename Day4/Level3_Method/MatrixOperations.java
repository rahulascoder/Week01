import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix with specified rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values between 0-9
            }
        }
        return matrix;
    }

    // Overloaded Method to display a matrix (for int[][])
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Overloaded Method to display a matrix (for double[][])
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(String.format("%.2f", element) + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0;
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) 
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) 
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted");
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted");
        }
        double[][] adjugate = new double[3][3];
        
        adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjugate[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjugate[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        
        adjugate[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjugate[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        
        adjugate[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjugate[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        double[][] inverse = new double[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / det;
            }
        }
        return inverse;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        // Create random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Add matrices
        System.out.println("\nAddition of matrices:");
        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        displayMatrix(addedMatrix);

        // Subtract matrices
        System.out.println("\nSubtraction of matrices:");
        int[][] subtractedMatrix = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractedMatrix);

        // Multiply matrices
        System.out.println("\nMultiplication of matrices:");
        int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multipliedMatrix);

        // Transpose matrix
        System.out.println("\nTranspose of Matrix 1:");
        int[][] transposedMatrix = transposeMatrix(matrix1);
        displayMatrix(transposedMatrix);

        // Determinants of 2x2 and 3x3 matrices
        System.out.println("\nDeterminant of 2x2 matrix:");
        int[][] matrix2x2 = {{3, 2}, {1, 4}};
        System.out.println(determinant2x2(matrix2x2));

        System.out.println("\nDeterminant of 3x3 matrix:");
        int[][] matrix3x3 = {{2, 5, 3}, {1, 4, 6}, {3, 2, 7}};
        System.out.println(determinant3x3(matrix3x3));

        // Inverse of 2x2 matrix
        System.out.println("\nInverse of 2x2 matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        displayMatrix(inverse2x2);

        // Inverse of 3x3 matrix
        System.out.println("\nInverse of 3x3 matrix:");
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        displayMatrix(inverse3x3);
    }
}
