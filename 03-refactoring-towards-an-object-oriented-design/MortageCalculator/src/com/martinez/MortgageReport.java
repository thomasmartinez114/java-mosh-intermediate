package com.martinez;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------");
        for (short month = 1; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgage() {
        double mortage = calculator.calculateMortgage();
        String formattedMortage = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println();
        System.out.println("MORTAGE");
        System.out.println("-----------");
        System.out.println("Mortage is: " + formattedMortage);
    }
}