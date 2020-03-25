package com.martinez;

/**
 * Issues with Procedual Programming (as the code below) is that:
 * 1) Main method will get bloated with bunch of variables and functions
 * 2) Functions/methods will have too many arguments
 * 3) Lack of reusability
 * 4) You change one thing and then other code will break (SPAGHETTI CODE)
 */

public class Main {

    public static void main(String[] args) {
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
