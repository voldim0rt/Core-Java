package com.tnmy;

import java.util.Scanner;

public class GreaterOfTwo {
    public static int greater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();

        System.out.println("The greater number among " +num1+ " and " +num2+ " is " +greater(num1, num2));
    }
}