package com.hackerrank.solutions.basic;

import java.util.Locale;

public class CaesarCipher {

    public static String answer(String s, int k){
        if(k > 26) k = k % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String rotated = alphabet.substring(k) + alphabet.substring(0, k);
        char[] answer = s.toCharArray();
        for(int i = 0; i < answer.length; i++){
            boolean isUppercase = Character.isUpperCase(answer[i]);
            int pos = alphabet.indexOf(Character.toLowerCase(answer[i]));
            if(pos >= 0){
                answer[i] = rotated.charAt(pos);
                if(isUppercase) answer[i] = Character.toUpperCase(answer[i]);
            }
        }
        return String.valueOf(answer);
    }
}
