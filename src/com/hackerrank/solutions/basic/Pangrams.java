package com.hackerrank.solutions.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pangrams {
    
    public static String answer(String s){
        Integer[] charCount = new Integer[26];
        Arrays.fill(charCount, 0);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(char c : s.toLowerCase().toCharArray()){
            int indexOf = alphabet.indexOf(c);
            if(indexOf >= 0){
                charCount[indexOf]++;
            }
        }
        List<Integer> counts = Arrays.asList(charCount);
        return counts.contains(0) ? "not pangram" : "pangram";
    }
}
