package com.martinez;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(100_000);
    }
}
