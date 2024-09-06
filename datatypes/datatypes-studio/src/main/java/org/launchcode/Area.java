package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter Radius now!: ");
        radius = input.nextDouble();

        double area = circle.getArea(radius); //(3.14 * radius * radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
