package com.martinez;

public interface TaxCalculator {
    float minimumTax = 100;
    double calculateTax();

    static double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
