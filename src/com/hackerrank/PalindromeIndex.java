package com.hackerrank;

public class PalindromeIndex {

    public static boolean isPalindrome(String s){
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }

    public static int answer(String s){
        if(isPalindrome(s)) return -1;
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) == s.charAt(s.length() - 1 - i)) continue;
            String firstHalf = s.substring(i, s.length() - 1 - i);
            String secondHalf = s.substring(i + 1, s.length() - i);
            if(isPalindrome(firstHalf)) return s.length() - 1 - i;
            if(isPalindrome(secondHalf)) return i;
            return -1;
        }
        return -1;
    }
}
