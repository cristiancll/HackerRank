package com.hackerrank.solutions.basic;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    
    public static List<Integer> answer(List<Integer> grades){
        List<Integer> roundedGrades = new ArrayList<>();
        for(Integer grade : grades){
            if(grade < 38 || grade % 5 == 0) {
                roundedGrades.add(grade);
                continue;
            }
            if((grade + 1) % 5 == 0) {
                roundedGrades.add(grade + 1);
                continue;
            }
            if((grade + 2) % 5 == 0) {
                roundedGrades.add(grade + 2);
                continue;
            }
            roundedGrades.add(grade);
        }
        return roundedGrades;
    }
}
