package com.martinez;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    // Declare calculateWage method
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
