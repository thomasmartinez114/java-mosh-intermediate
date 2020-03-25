package com.martinez;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int extraHours;

    // Declare calculateWage method
    public int calculateWage() {
        return baseSalary + (hourlyRate * extraHours);
    }
}
