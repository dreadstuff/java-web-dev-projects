package org.launchcode;
import java.util.Scanner;

public class MPGCalc {
    public static void main(String[] args) {
        double numberofmiles;
        double amountofgas;
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);

        System.out.println("Please enter the number of miles you've driven: ");
        numberofmiles = input.nextDouble();

        System.out.println("Please enter the amount of gas (gallons) you've used: ");
        amountofgas = input.nextDouble();

        System.out.println("You've driven " + numberofmiles/amountofgas + " miles-per-gallon so far.");

    }
}
