package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args){

        // 輸入三個數字在同一行
        Scanner scanner = new Scanner(System.in);
        String inputsLine = scanner.nextLine();
        String[] inputsStr = inputsLine.split(" ");

        // 初始化需要的資料
        Integer a = Integer.parseInt(inputsStr[0]);
        Integer b = Integer.parseInt(inputsStr[1]);
        Integer result = Integer.parseInt(inputsStr[2]);

        // 判斷是否可以為and邏輯
        boolean ableToBeAnd = checkAndPosible(a,b,result);
        // 判斷善否可以為or邏輯
        boolean ableToBeOr = checkOrPosible(a,b,result);
        // 判斷是否可以為XOR邏輯
        boolean ableToBeXor = checkXorPosible(a,b,result);

        if(ableToBeAnd){
            System.out.println("AND");
        }
        if(ableToBeOr){
            System.out.println("OR");
        }
        if(ableToBeXor){
            System.out.println("XOR");
        }
        if(!ableToBeAnd && !ableToBeOr && !ableToBeXor){
            System.out.println("IMPOSSIBLE");
        }

    }

    public static boolean checkAndPosible(Integer a, Integer b, Integer result){

        boolean aIsZero = a == 0;
        boolean bIsZero = b == 0;

        if(aIsZero && bIsZero){
            return result == 0;
        } else if (aIsZero) {
            return result == 0;
        } else if (bIsZero) {
            return result == 0;
        } else {
            return result == 1;
        }

    }

    public static boolean checkOrPosible(Integer a, Integer b, Integer result){

        boolean aIsZero = a == 0;
        boolean bIsZero = b == 0;

        if(aIsZero && bIsZero){
            return result == 0;
        } else if (aIsZero) {
            return result == 1;
        } else if (bIsZero) {
            return result == 1;
        } else {
            return result == 1;
        }

    }

    public static boolean checkXorPosible(Integer a, Integer b, Integer result){

        boolean aIsZero = a == 0;
        boolean bIsZero = b == 0;

        if(aIsZero && bIsZero){
            return result == 0;
        } else if (aIsZero) {
            return result == 1;
        } else if (bIsZero) {
            return result == 1;
        } else {
            return result == 0;
        }

    }

}
