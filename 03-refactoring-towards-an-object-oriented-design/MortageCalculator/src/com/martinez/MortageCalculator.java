package com.martinez;

public class MortageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numOfPaymentsMade // short because # can be over 300 - byte can only store 256
    ) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numPayments = (short) (Main.MONTHS_IN_YEAR * years);

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

        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numPayments = (short) (Main.MONTHS_IN_YEAR * years);

        double mortage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)
                / (Math.pow(1 + monthlyInterest, numPayments) - 1));

        return mortage;
    }
}