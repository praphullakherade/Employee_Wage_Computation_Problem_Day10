package com.employeewage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program using OOP");

        //creating object
        EmployeeWageChildClass DMart = new EmployeeWageChildClass("D-Mart",20,10,50);
        EmployeeWageChildClass StarHome = new EmployeeWageChildClass("Star Home",10,15,80);

        //Getting Wages For Working Hour And Days for company
        DMart.wagesForWorkingHourAndDays();
        System.out.println(DMart);
        StarHome.wagesForWorkingHourAndDays();
        System.out.println(StarHome);
    }
}
