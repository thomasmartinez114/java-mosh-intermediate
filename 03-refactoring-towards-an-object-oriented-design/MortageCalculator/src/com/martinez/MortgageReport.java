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
        for (double balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
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