package com.tnmy;

import java.util.Scanner;

public class CreatingNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for taking array as an input
        System.out.print("Enter the array elements one by one: ");
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //for printing array
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}