package com.martinez;

import java.text.NumberFormat;

public class MortageReport {
    private static void printMortage(int principal, float annualInterest, byte years) {
        double mortage = Main.calculateMortage(principal, annualInterest, years);
        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("MORTAGE");
        System.out.println("-----------");
        System.out.println("Mortage is: " + formattedMortage);
    }
}
