package com.tnmy;

import java.util.Scanner;

public class SumOfInputStreamOfnNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            System.out.print("Enter an integer (enter 0 for sum): ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum of entered integers: " + sum);
        scanner.close();
    }
}
