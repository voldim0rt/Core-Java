package com.tnmy;
import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        // int n = 5;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//output:

//     *
//    **
//   ***
//  ****
// *****