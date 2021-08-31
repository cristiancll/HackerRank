package com.hackerrank.solutions.basic;

import java.util.List;

public class DivisibleSumPairs {
    
    public static int answer(int n, int k, List<Integer> ar){
        int result = 0;
        for(int i = 0; i < n; i++){
            int firstElement = ar.get(i);
            for(int j = i + 1; j < n; j++){
                int secondElement = ar.get(j);
                if((firstElement + secondElement) % k == 0) result++;
            }
        }
        return result;
    }
}
