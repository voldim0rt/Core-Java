package com.tnmy;

import java.util.Scanner;

public class VotingEligibility {
    public static int vote(int a){
        if(a >= 18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("Sorry! You are not eligible for voting");
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = sc.nextInt();
        vote(num);

    }
}