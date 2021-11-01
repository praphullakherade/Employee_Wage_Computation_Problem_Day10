package com.employeewage;

import java.util.Random;

public class EmployeeWage  {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program using OOP");
        EmployeeWageChildClass employeeWage = new EmployeeWageChildClass();
        employeeWage.addEmpWage("D-Mart",20,10,50);
        employeeWage.addEmpWage("Star Home",10,15,80);
        employeeWage.addEmpWage("infinity",25,20,80);
        employeeWage.wagesForWorkingHourAndDays();

    }
}
