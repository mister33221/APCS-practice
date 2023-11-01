package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        // scanner
        Scanner scanner = new Scanner(System.in);
        // enter number of students
        System.out.println("Enter the number of students, the number must under or equal to 20:");
        int numberOfStudents = scanner.nextInt();
        // enter each student's score
        System.out.println("Enter each student's score, separated by a space:");
        scanner.nextLine();
        String scoresBeforeSplit = scanner.nextLine();
        String[] scoresAfterSplitStr = scoresBeforeSplit.split(" ");
        Integer[] scoresAfterSplitInt = new Integer[scoresAfterSplitStr.length];
        for(String scoreStr : scoresAfterSplitStr) {
            int index = Arrays.asList(scoresAfterSplitStr).indexOf(scoreStr);
            scoresAfterSplitInt[index] = Integer.parseInt(scoreStr);
        }

        // sort the scores
        Arrays.sort(scoresAfterSplitInt);

        // get a array which scores are under 60
        ArrayList<Integer> scoresUnder60 = getScoresUnder60(scoresAfterSplitInt);
        ArrayList<Integer> scoresEqualAndAbove60 = getScoresEqualAndAbove60(scoresAfterSplitInt);

        // print result
        // line 1
        System.out.println(Arrays.toString(scoresAfterSplitInt));
        // line 2
        if(scoresUnder60.isEmpty()){
            System.out.println("best case");
        } else{
            System.out.println(scoresUnder60.get(scoresUnder60.size()-1));
        }
        // line 3
        if(scoresEqualAndAbove60.isEmpty()){
            System.out.println("worst case");
        } else{
            System.out.println(scoresEqualAndAbove60.get(0));
        }
    }

    public static ArrayList<Integer> getScoresUnder60(Integer[] scoresAfterSplitInt){
        ArrayList<Integer> scoresUnder60 = new ArrayList<>();
        for(Integer score: scoresAfterSplitInt){
            if(score < 60){
                scoresUnder60.add(score);
            }
        }

        return scoresUnder60;
    }

    public static ArrayList<Integer> getScoresEqualAndAbove60(Integer[] scoresAfterSplitInt){
        ArrayList<Integer> scoresEqualAndAbove60 = new ArrayList<>();
        for(Integer scores: scoresAfterSplitInt){
            if(scores >= 60){
                scoresEqualAndAbove60.add(scores);
            }
        }
        return  scoresEqualAndAbove60;
    }






}