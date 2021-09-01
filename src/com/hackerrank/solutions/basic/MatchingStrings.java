package com.hackerrank.solutions.basic;

import java.util.*;

public class MatchingStrings {

    public static List<Integer> answer(List<String> strings, List<String> queries) {
        Map<String, Integer> total = new HashMap<>();
        for(String s : strings){
            total.merge(s, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for(String query : queries){
            result.add(total.getOrDefault(query, 0));
        }
        return result;
    }
}
