package com.hackerrank.solutions.basic;

public class TowerBreakers {

    public static int answer(int n, int m){
        if(m == 1 || n % 2 == 0) return 2;
        return 1;
    }
}
