package Week1.Assignment4;

import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        
        int[][] matrix1 = createRandomMatrix(rows, columns);
        int[][] matrix2 = createRandomMatrix(rows, columns);
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nMatrix Addition:");
        int[][] additionResult = addMatrices(matrix1, matrix2);
        displayMatrix(additionResult);

        System.out.println("\nMatrix Subtraction:");
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        displayMatrix(subtractionResult);

        System.out.println("\nMatrix Multiplication:");
        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        displayMatrix(multiplicationResult);

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transposeMatrix1 = transposeMatrix(matrix1);
        displayMatrix(transposeMatrix1);

        System.out.println("\nDeterminant of Matrix 1 (3x3):");
        double determinantMatrix1 = determinantOf3x3(matrix1);
        System.out.println(determinantMatrix1);

        System.out.println("\nInverse of Matrix 1 (3x3):");
        double[][] inverseMatrix1 = inverseOf3x3(matrix1);
        displayMatrix(inverseMatrix1);
    }

    public static int[][] createRandomMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;  
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static double determinantOf2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static double determinantOf3x3(int[][] matrix) {
        double determinant = 0;
        determinant += matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]));
        determinant -= matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]));
        determinant += matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));
        return determinant;
    }

    public static double[][] inverseOf2x2(int[][] matrix) {
        double determinant = determinantOf2x2(matrix);
        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / determinant;
        inverse[0][1] = -matrix[0][1] / determinant;
        inverse[1][0] = -matrix[1][0] / determinant;
        inverse[1][1] = matrix[0][0] / determinant;
        
        return inverse;
    }

    public static double[][] inverseOf3x3(int[][] matrix) {
        double determinant = determinantOf3x3(matrix);
        if (determinant == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]); 
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]);
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]);
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]);
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]);
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]);
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
