package com.hackerrank.solutions.basic;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

    public static void answer(List<Integer> arr) {
        List<Integer> sortedArray = arr.stream().sorted().collect(Collectors.toList());;
        BigInteger min = BigInteger.ZERO;
        for(Integer num : sortedArray.subList(0, 4)){
            min = min.add(new BigInteger(String.valueOf(num)));
        }
        BigInteger max = BigInteger.ZERO;
        for(Integer num : sortedArray.subList(sortedArray.size() - 4, sortedArray.size())){
            max = max.add(new BigInteger(String.valueOf(num)));
        }
        System.out.println(min+" "+max);
    }
}
