package com.tnmy;
import java.util.Scanner;


public class triangle0_1 {
    public static void main(String[] args) {
        // int n = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum%2==0){
                    System.out.print("1" + " ");;
                }else{
                    System.out.print("0" + " ");
                }

            }
            System.out.println();
        }
    }
}


// output:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1