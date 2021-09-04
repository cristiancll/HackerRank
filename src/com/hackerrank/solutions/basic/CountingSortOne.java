package com.hackerrank.solutions.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSortOne {
    
    public static List<Integer> answer(List<Integer> arr){
        Integer[] counts = new Integer[100];
        Arrays.fill(counts, 0);
        for (Integer integer : arr) {
            counts[integer]++;
        }
        return Arrays.asList(counts);
        
//        Full Counting sort algorithm
        
//        for(int i = 1; i < counts.length; i++){
//            counts[i] += counts[i - 1];
//        }
//        for(int i = counts.length-1; i > 0; i--){
//            counts[i] = counts[i - 1];
//        }
//        counts[0] = 0;
//
//        Integer[] results = new Integer[arr.size()];
//        Arrays.fill(results, 0);
//        for(int i = 0; i < arr.size(); i++){
//            int number = arr.get(i);
//            results[counts[number]] = number;
//            counts[number]++;
//        }
//        return Arrays.asList(results);
    }
}
