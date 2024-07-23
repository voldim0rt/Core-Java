package com.tnmy;
import java.util.Scanner;


public class CountNumbers  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zero=0;
        int pos = 0;
        int neg = 0;

        char choice;

        do {
            System.out.print("Enter the numbers:");
            int a = sc.nextInt();
            if(a>0){
                pos++;
            }else if(a<0){
                neg++;
            }else{
                zero++;
            }
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
        }while(choice == 'y' || choice == 'Y');
        System.out.println("Count of positive numbers is: " +pos);
        System.out.println("Count of negative numbers is: " +neg);
        System.out.println("Count of zeroes is: " +zero);
    }
}
