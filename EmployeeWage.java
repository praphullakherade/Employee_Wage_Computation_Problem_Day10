package com.employeewage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");

        //creating object
        EmployeeWageChildClass employeeData = new EmployeeWageChildClass();

        //Getting Wages For Working Hour And Days for company
        employeeData.wagesForWorkingHourAndDays("D-Mart",20,10,50);
        employeeData.wagesForWorkingHourAndDays("Star Home",10,15,80);
    }
}
