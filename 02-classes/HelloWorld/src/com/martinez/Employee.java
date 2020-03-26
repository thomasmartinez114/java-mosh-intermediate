package com.martinez;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    // Declare calculateWage method
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // Setter
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // Getter
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    // Getter
    public int getHourlyRate() {
        return hourlyRate;
    }
}
