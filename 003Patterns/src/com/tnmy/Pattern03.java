package com.tnmy;

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        // int n = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output:

// *
// **
// ***
// ****
// *****