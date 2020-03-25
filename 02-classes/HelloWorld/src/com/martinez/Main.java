package com.martinez;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
