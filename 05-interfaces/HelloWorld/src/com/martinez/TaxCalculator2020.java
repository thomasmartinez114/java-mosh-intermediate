package com.martinez;

public class TaxCalculator2020 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2020(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    // Telling this method is overriding/implementing Interface method
    public double calculateTax() {
        TaxCalculator.minimumTax = 10;
        return taxableIncome * 0.3;
    }
}
