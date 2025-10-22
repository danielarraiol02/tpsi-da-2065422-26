package pt.uma.tpsi.ad.utils;

import java.util.Arrays;

public class MatrixUtilities {

    public static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isMatrix(int[][] matrix){

        int numCols = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != numCols){
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentity(int[][] matrix){
        if (!isMatrix(matrix)){
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && matrix[i][j] != 1){
                    return false;
                }
                else if(i != j && matrix[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplyBy(int[][] matrix, int value){

        int[][] newMatrix = Arrays.copyOf(matrix, matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return newMatrix;
    }
    public static boolean areCompatibleForSum(int[][] matrix, int[][] matrix2){
        if (matrix.length != matrix2.length) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix2[i].length) {
                return false;
            }
        }

        return true;
    }

    public static int[][] sumOf(int[][] matrix, int[][] matrix2){

        if (!areCompatibleForSum(matrix, matrix2))
            return null;

        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                newMatrix[i][j] = matrix[i][j] + matrix2[i][j];

            }
        }
        return newMatrix;
    }


}
