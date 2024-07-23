package com.tnmy;
import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        // int n = 5;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//Output:

// 1
// 12
// 123
// 1234
// 12345