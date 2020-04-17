package com.martinez;

public class TaxReport {
    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
