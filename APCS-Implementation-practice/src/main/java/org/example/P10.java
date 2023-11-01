package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P10 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Integer number = scanner.nextInt();

        String friendConnectTo = scanner.nextLine();
        String[] friendConnectToStr = friendConnectTo.split(" ");
        ArrayList<Integer> friendConnectToInt = new ArrayList<>();

        for(String value: friendConnectToStr){
            friendConnectToInt.add(Integer.parseInt(value));
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer value: friendConnectToInt){
            map.put(friendConnectToInt.indexOf(value),value);
        }

        Integer index = 0;
        boolean loop = true;
        ArrayList<Integer> group = new ArrayList<>();
        group.add(index);
        while (loop){

            group.add(map.get(index));
            index = map.get(index)
        }
    }

}
