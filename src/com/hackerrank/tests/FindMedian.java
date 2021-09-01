package com.hackerrank.tests;

import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {

    public static int answer(List<Integer> arr){
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        return sorted.get(sorted.size() / 2);
    }
    
}
