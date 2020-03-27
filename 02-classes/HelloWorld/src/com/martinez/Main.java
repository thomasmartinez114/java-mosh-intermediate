package com.martinez;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(-5);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
