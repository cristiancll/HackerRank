package com.hackerrank.solutions.basic;

public class CountingValleys {
    
    
    public static int answer(int steps, String path){
        int totalValleys = 0;
        int level = 0;
        for(char p : path.toUpperCase().toCharArray()){
            int currLevel = level;
            if(p == 'U'){
                level++;
            } else if(p == 'D') {
                level--;
            }
            if(currLevel < 0 && level == 0){
                totalValleys++;
            }
        }
        return totalValleys;
    }
}
