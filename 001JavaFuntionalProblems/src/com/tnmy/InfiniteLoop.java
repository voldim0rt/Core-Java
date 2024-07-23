package com.tnmy;
import java.util.Scanner;


public class InfiniteLoop {
    public static int infinity(int a){

        do {
            a++;
            System.out.println(a);
        }while(a>=0);
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to start the loop: ");
        int num = sc.nextInt();
        infinity(num);
    }
}