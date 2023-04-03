package com.codewars.kyu_8.task2;


import java.util.stream.IntStream;


public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return IntStream.of(args)
                .min()
                .getAsInt();
    }
//        List<Integer> listOfNumbers= Arrays.stream(args)
//                .boxed()
//                .toList();
//        int min=listOfNumbers.stream()
//                .min(Integer::compare).get();
//
//        return min;
//    int min = args[0];
//    for(int i = 1 ;i< args.length;i++){
//    if(min>args[i])
//    min=args[i];}
//    return min;


}
