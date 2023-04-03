package com.codewars.kyu_8.task7;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        double result = weight/(height*height);

        return (result<=18.5) ? ("Underweight"):(result<=25) ? ("Normal"): (result<=30)? ("Overweight"):("Obese");
    }
}
