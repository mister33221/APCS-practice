package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P9Undone {

    public static void main(String[] args){

        // 有N群數字
        // N群數字中都有M個正整數
        // 每群數字中各選擇一個數字，如第i群所選出的數字就是ti
        // 將這N個數字加總為S
        // 請計算出總和S的最大值，並判斷各群所選出的數字是否可以整除S

        Scanner scanner = new Scanner(System.in);

        // line 1 :　Ｎ(有N群數字) M(有M個正整數)
        String specInput = scanner.nextLine();
        String[] splitedLine1Str = specInput.split(" ");
//        ArrayList<Integer> splitedLine1Int = new ArrayList<>();
//        for(String value: splitedLine1Str){
//            splitedLine1Int.add(Integer.parseInt(value));
//        }
        List<Integer> splitedLine1Int = Arrays.stream(specInput.split(" ")).map(Integer::parseInt).toList();

        Integer[][] dataMatrix = new Integer[splitedLine1Int.get(0)][splitedLine1Int.get(1)];

        for(Integer[] mGroup: dataMatrix){
            String mGroupInput = scanner.nextLine();

        }

    }

}
