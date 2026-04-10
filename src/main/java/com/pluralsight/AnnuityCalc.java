package com.pluralsight;

import java.util.Scanner;

public class AnnuityCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // asking for monthly payout, expected interest rate, and years to pay out
        System.out.println("Welcome to the Annuity Calculator!");
        System.out.print("What is your monthly pay out?: $");
        int payout = sc.nextInt();
        System.out.print("What is your expected interest rate?: ");
        double interest = sc.nextDouble();
        System.out.print("And the years of your contract?: ");
        int years = sc.nextInt();

        // variables
        int p = payout;
        double i = (interest/100) / 12;
        int y = years * 12;
        double top = 1 - Math.pow(1 + i, -y);
        double bottom = i;
        double pv = p * (top/bottom);

        System.out.println("Calculating...");
        System.out.printf("The present value of your annuity is $%.2f", pv);

    }
}
