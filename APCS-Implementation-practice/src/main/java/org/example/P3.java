package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class P3 {

    public static void main(String[] args){

        // 輸入三個數字
        Scanner scanner = new Scanner(System.in);
        String sidesLine = scanner.nextLine();

        // 處理三個數字
        String[] sidesStr = sidesLine.split(" ");
        ArrayList<Integer> sidesInt = new ArrayList<>();
        for(String side: sidesStr){
            sidesInt.add(Integer.parseInt(side));
        }

        // 將這三個數字從小到大排列
        sidesInt.sort(Comparator.naturalOrder());
        System.out.println(sidesInt.toString());

        // 判斷是否這三個資料是否可以組成三角形，若不行則印出"NO"
        checkSides(sidesInt);

    }

    public static void checkSides(ArrayList<Integer> sidesInt){
        var a = sidesInt.get(0);
        var b = sidesInt.get(1);
        var c = sidesInt.get(2);

        if(a + b <= c){
            System.out.println("No");
        }else if(a * a + b * b < c * c){
            System.out.println("Obtuse");
        }else if(a * a + b * b == c * c){
            System.out.println("Right");
        }else if(a * a + b * b > c * c){
            System.out.println("Acute");
        }

    }



}
