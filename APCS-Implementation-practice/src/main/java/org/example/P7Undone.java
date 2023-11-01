package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class P7Undone {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] spec = firstLine.split(" ");
        int rowNumber = Integer.parseInt(spec[0]);
        int columnNumber = Integer.parseInt(spec[1]);
        int adjustTimes = Integer.parseInt(spec[2]);

        Integer[][] matrix = new Integer[rowNumber][columnNumber];


        for(int i = 1; i <= rowNumber; i ++){
            String valuesStr = scanner.nextLine();
            String[] splitedValuesStr = valuesStr.split(" ");
            for(int j = 1; j <= columnNumber; j++){
                matrix[i-1][j-1] = Integer.parseInt(splitedValuesStr[j-1]);
            }
        }


        String lastLine = scanner.nextLine();

        System.out.println(firstLine);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(lastLine);

//        matrix = reverse(matrix);
//        System.out.println(Arrays.deepToString(matrix));

        matrix = transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static Integer[][] reverse(Integer[][] matrix){

        Integer[][] reversedMatrix = new Integer[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            reversedMatrix[i] = matrix[matrix.length - 1 - i];
        }

        return reversedMatrix;
    }

    public static Integer[][] transpose(Integer[][] matrix){

        Integer[][] transposedMatrix = new Integer[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

}
