package com.tnmy;

public class Pattern01_Butterfly{
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            // 1st half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // --------------------------------------------------------------
        for (int i = n; i >= 1; i--) {
            // 2nd half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

// Output

// *            *
// **          **
// ***        ***
// ****      ****
// *****    *****
// ******  ******
// **************
// **************
// ******  ******
// *****    *****
// ****      ****
// ***        ***
// **          **
// *            *