package com.tnmy;

import java.util.Scanner;
public class CreatingCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        //input
        System.out.print("Enter the names: ");
        for(int i = 0; i<size; i++){
            names[i] = sc.next();
        }

        //printing
        for(int i = 0; i < names.length; i++){
            System.out.println("name " +(i+1)+ " is " +names[i]);
        }

    }
}

