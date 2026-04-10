package com.pluralsight;

import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I want to welcome the user and ask for their principal, interest, and loan rate
        System.out.println("Welcome to the Mortgage Calculator!");
        System.out.print("What is the principal on your loan?: $");
        int principal = sc.nextInt();
        System.out.print("Okay now, what is the interest on your loan?: ");
        double interest = sc.nextDouble();
        System.out.print("Finally, how many years is your loan?: ");
        int years = sc.nextInt();

        // variables
        int p = principal;
        double r = interest/100;
        int n = years * 12;
        double i = r /12;
        double compound = Math.pow(1 + i, n);
        double m = p * (i * compound)/ (compound -1);
        double totInt = (m * n) - p;

        System.out.println("Calculating...");
        System.out.printf("Expected monthly payment: $%.2f \n", m);
        System.out.printf("Expected total interest paid over time: $%.2f \n", totInt);
    }
}
