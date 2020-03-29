// Ask user for:
// Principal
// Annual Interest Rate (divide by 100 then divide by 12) to get monthly interest
// Period (Years)
// Return Mortage rate (monthly): $###.##
// Formula used is:
// M = (P(r(1+r)^n)/((1+r)^

package com.martinez;

import java.text.NumberFormat;


public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Length of Loan (Years): ", 1, 30);

        printMortage(principal, annualInterest, years);

        printPaymentSchedule(principal, annualInterest, years);
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
