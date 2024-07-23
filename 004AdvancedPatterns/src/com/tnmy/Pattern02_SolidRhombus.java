package com.tnmy;

public class Pattern02_SolidRhombus {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// output:

//    ****
//   ****
//  ****
// ****