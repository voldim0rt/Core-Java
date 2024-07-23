package com.tnmy;

import java.util.Scanner;

public class Pattern04  {
    public static void main(String[] args) {
        // int n = 4;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output:

// *****
// ****
// ***
// **
// *