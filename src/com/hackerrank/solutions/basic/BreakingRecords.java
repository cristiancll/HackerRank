package com.hackerrank.solutions.basic;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    
    public static List<Integer> answer(List<Integer> scores){
        int min = 0; 
        int max = 0;
        BigInteger recordMin = new BigInteger(String.valueOf(scores.get(0))); 
        BigInteger recordMax = new BigInteger(String.valueOf(scores.get(0)));
        for(Integer s : scores){
            BigInteger score = new BigInteger(String.valueOf(s));
            if(score.compareTo(recordMin) == -1){
                recordMin = score;
                min++;
            }
            if(score.compareTo(recordMax) == 1){
                recordMax = score;
                max++;
            }
        }
        return Arrays.asList(max, min);
    }
}
