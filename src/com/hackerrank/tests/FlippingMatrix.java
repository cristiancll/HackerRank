package com.hackerrank.tests;

import java.util.List;

public class FlippingMatrix {

    public static int answer(List<List<Integer>> m) {
        int maximumSum = 0;
        int s = m.size();
        int q = s / 2;

//        0 1 2  2 1 0
//        3 4 5  5 4 3
//        6 7 8  8 7 6
//
//        6 7 8  8 7 6
//        3 4 5  5 4 3
//        0 1 2  2 1 0

//        i,j    i,n
//        n,j    n,n

        for(int i = 0; i < q; i++){
            for(int j = 0; j < q; j++){
                maximumSum +=
                    Math.max( // Finding the maximum value on the current position
                        Math.max( // Finding the maximum value on the upper corners
                            m.get(i).get(j),
                            m.get(i).get((s - 1) - j)
                        ),
                        Math.max( // Finding the maximum value on the lower corners
                            m.get((s - 1) - i).get(j),
                            m.get((s - 1) - i).get((s - 1) - j)
                        )
                    );
            }
        }
        return maximumSum;
    }

}
