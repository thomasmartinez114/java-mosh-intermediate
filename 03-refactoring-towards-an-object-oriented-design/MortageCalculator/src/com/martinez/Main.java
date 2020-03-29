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

        MortageReport.printMortage(principal, annualInterest, years);

        MortageReport.printPaymentSchedule(principal, annualInterest, years);
    }
}
