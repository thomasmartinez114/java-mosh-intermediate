package com.martinez;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome, double insurance) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
