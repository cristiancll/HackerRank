package com.hackerrank.solutions.basic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {

    public static void answer(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (Integer num : arr) {
            if (num == 0) zero++;
            else if (num * 1 < 0) negative++;
            else positive++;
        }
        int size = arr.size();
        System.out.println(new BigDecimal(positive).divide(new BigDecimal(size), 6, RoundingMode.FLOOR));
        System.out.println(new BigDecimal(negative).divide(new BigDecimal(size), 6, RoundingMode.FLOOR));
        System.out.println(new BigDecimal(zero).divide(new BigDecimal(size), 6, RoundingMode.FLOOR));
    }
}
