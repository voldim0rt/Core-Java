package com.tnmy;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static int sumOfOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The sum of range 1 to " + n + " is " + sumOfOdd(n));
    }
}
