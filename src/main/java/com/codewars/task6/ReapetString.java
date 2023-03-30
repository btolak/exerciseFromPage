package com.codewars.task6;

public class ReapetString {
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
