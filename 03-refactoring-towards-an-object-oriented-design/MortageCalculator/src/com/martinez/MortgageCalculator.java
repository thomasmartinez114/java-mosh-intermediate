package com.martinez;

public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principal, float annualInterest, byte years){
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateBalance(short numOfPaymentsMade) {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numPayments = (short) (Main.MONTHS_IN_YEAR * years);

        // B = L[(1 + c)^n - (1 + c)^p] / [(1 + c)^n - 1]
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numPayments) - Math.pow(1 + monthlyInterest, numOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / Main.PERCENT / Main.MONTHS_IN_YEAR;
        short numPayments = (short) (Main.MONTHS_IN_YEAR * years);

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numPayments)
                / (Math.pow(1 + monthlyInterest, numPayments) - 1));

        return mortgage;
    }

    public short getYears() {
        return years;
    }
}
