package com.codewars.kyu_8.task9;

public class GrassHopper {
    public static int summation(int n) {
    int sum=0;
        for(int i = 0; i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum; }
    public static void main(String[] args) {
        summation(8);
    }
}
