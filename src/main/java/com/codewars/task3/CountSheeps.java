package com.codewars.task3;

public class CountSheeps {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
      try{  for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]==true) {
                count++;
            }

        }}catch (NullPointerException nulle){

        nulle.printStackTrace();
      }
        return count;
    }
}
