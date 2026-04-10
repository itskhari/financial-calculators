package com.pluralsight;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I want to ask the user for deposit, interset rate, and years
        System.out.println("Welcome to the Futures Calculator!");
        System.out.print("What is the deposit on your item?: $");
        int deposit = sc.nextInt();
        System.out.print("What is the interest?: ");
        double interest = sc.nextDouble();
        System.out.print("And in how many years does your item mature?: ");
        int years = sc.nextInt();

        // variables
        int d = deposit;
        double r = interest/100;
        int y = years;
        double daily = r / 365;
        double power = 365 * y;
        double fv = d * Math.pow(1 + daily, power);
        double earned = fv - d;

        System.out.println("Calculating...");
        System.out.printf("The future value of you item is $%.2f\n", fv);
        System.out.printf("The interest earned on your item is $%.2f\n", earned);



    }
}
