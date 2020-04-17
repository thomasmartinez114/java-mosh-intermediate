package com.martinez;

public class TaxCalculator2020 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    
    public double calculateTax() {
        return taxableIncome * 0.4;
    }
}
