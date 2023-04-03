package com.codewars.kyu_8.task6;

public class RepeatString {
    public static String repeatStr(final int repeat, final String string) {
        /***
         its redundant!!
        if(repeat==0){
            return "";
        } else if (string.isEmpty()) {
            return "";
        }
        ***/
       return string.repeat(repeat);
    }
}
