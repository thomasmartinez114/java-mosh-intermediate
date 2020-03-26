package com.martinez;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    // Declare calculateWage method
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
