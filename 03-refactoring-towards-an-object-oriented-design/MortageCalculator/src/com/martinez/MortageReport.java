package com.martinez;

import java.text.NumberFormat;

public class MortageReport {

    private static MortageCalculator calculator;

    private static void printMortage(int principal, float annualInterest, byte years) {
        calculator = new MortageCalculator(principal, annualInterest, years);
        double mortage = calculator(principal, annualInterest, years);
        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("MORTAGE");
        System.out.println("-----------");
        System.out.println("Mortage is: " + formattedMortage);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = calculator(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
