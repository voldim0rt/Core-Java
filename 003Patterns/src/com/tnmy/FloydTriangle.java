package com.tnmy;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        // int n = 5;
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

    }
}

//output

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15