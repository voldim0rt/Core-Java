package com.tnmy;

import java.util.Scanner;

public class CircumferenceOfTheCircle {
    public static double circumference(double radius){
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double circumference = circumference(radius);
        System.out.println("The circumference of the circle is: " + circumference);

    }
}