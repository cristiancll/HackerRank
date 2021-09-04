package com.hackerrank.solutions.basic;

public class MarsExploration {
    
    public static int answer(String s){
        int errorCount = 0;
        int sosCount = 0;
        for(char c : s.toUpperCase().toCharArray()){
            if((sosCount == 0 || sosCount == 2) && c != 'S') errorCount++;
            else if(sosCount == 1 && c != 'O') errorCount++;
            if(sosCount < 2) sosCount++;
            else sosCount = 0;
        }
        return errorCount;
    }
}
