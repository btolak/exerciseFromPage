package com.codewars.kyu_8.task5;


public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length < 1) {
            return new int[]{};
        }
        int positives = 0;
        int negatives = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positives++;
            } else if (input[i] < 0) {
                negatives += input[i];
            }
        }
        return new int[]{positives, negatives};
    }
}
