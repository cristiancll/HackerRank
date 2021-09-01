package com.hackerrank.solutions.basic;

import java.util.List;
import java.util.stream.Collectors;

public class LonelyInteger {
    
    public static int answer(List<Integer> a){
        List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
        if(sorted.size() == 1) return sorted.get(0);
        for(int i = 0; i < sorted.size(); i++){
            if(i == 0) continue;
            int previous = sorted.get(i - 1);
            int current = sorted.get(i);
            if(i + 1 >= sorted.size()) return current;
            int next = sorted.get(i + 1);
            if(previous != current && current != next) return current;
        }
        return -1;
    }
}
