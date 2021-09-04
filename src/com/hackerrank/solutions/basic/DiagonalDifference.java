package com.hackerrank.solutions.basic;

import java.util.List;

public class DiagonalDifference {
    
    public static int answer(List<List<Integer>> arr){
        int leftToRight = 0;
        int rightToLeft = 0;
        for(int i = 0; i < arr.size(); i++){
            leftToRight += arr.get(i).get(i);
            rightToLeft += arr.get(i).get((arr.size() - 1) - i);
        }
        return Math.abs(leftToRight - rightToLeft);
    }
}
