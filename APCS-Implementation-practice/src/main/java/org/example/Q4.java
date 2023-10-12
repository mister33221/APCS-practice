package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

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

    }

    public static Integer[][] reverse(Integer[][] matrix){
        return matrix;
    }

    public static Integer[][] spin(Integer[][] matrix){
        return matrix;
    }

}
