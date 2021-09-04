package com.hackerrank.solutions.basic;


public class FlippingBits {
    
    public static long answer(long n){
        return (long) (Math.pow(2, 32) - 1) - n;
    }
    
}
