package org.launchcode;
import  java.util.Scanner;

public class RectangleCalc {
    public static void main(String[] args) {
        double length;
        double width;
        java.util.Scanner input;
        input = new java.util.Scanner(System.in);

        System.out.println("Please enter the length of the rectangle: ");
        length = input.nextDouble();

        System.out.println("Please enter the width of the rectangle: ");
        width = input.nextDouble();

        System.out.println("The area of your rectangle is " + length + " by " + width + " which equals " + length*width);

    }
}