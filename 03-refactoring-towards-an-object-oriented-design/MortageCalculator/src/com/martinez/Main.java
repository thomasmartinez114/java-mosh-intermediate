// Ask user for:
// Principal
// Annual Interest Rate (divide by 100 then divide by 12) to get monthly interest
// Period (Years)
// Return Mortage rate (monthly): $###.##
// Formula used is:
// M = (P(r(1+r)^n)/((1+r)^n)-1)

package com.martinez;

import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readNumber("Length of Loan (Years): ", 1, 30);

        printMortage(principal, annualInterest, years);

        printPaymentSchedule(principal, annualInterest, years);
    }

    private static void printMortage(int principal, float annualInterest, byte years) {
        double mortage = calculateMortage(principal, annualInterest, years);
        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("MORTAGE");
        System.out.println("--------");
        System.out.println("Mortage is: " + formattedMortage);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numOfPaymentsMade // short because # can be over 300 - byte can only store 256
    ) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numPayments = (short) (MONTHS_IN_YEAR * years);

        // B = L[(1 + c)^n - (1 + c)^p] / [(1 + c)^n - 1]
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numPayments) - Math.pow(1 + monthlyInterest, numOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numPayments) - 1);

        return balance;
    }

    public static double calculateMortage(
            int principal,
            float annualInterest,
            byte years) {

        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numPayments = (short) (MONTHS_IN_YEAR * years);

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)
                / (Math.pow(1 + monthlyInterest, numPayments) - 1));

        return mortage;
    }
}
