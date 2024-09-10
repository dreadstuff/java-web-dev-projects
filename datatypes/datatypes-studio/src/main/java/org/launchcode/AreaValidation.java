package org.launchcode;
import radius.Int;

import java.util.Scanner;

public class AreaValidation {
    public static void main(String[] args) {
        double radius;
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("Enter Radius now!: ");
        radius = input.nextDouble();
        double area = circle.getArea(radius);

        if (radius <= 0) {
            System.out.println("Area must be a positive number");
            input.close();
        } else if (input.hasNextDouble()){
            System.out.println("Radius must be a number");
            input.close();
        } else {
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            input.close();
        }
    }
}
