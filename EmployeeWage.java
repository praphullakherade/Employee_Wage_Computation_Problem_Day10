package com.employeewage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Compuation Program");
        Random num = new Random ();
        int CheckAvail= num.nextInt(2);
        System.out.println(" CheckAvail is " + CheckAvail);
        int WagePerHour = 20;
        int FulldayHour = 8;
        if (CheckAvail == 1)
        {
            int DailyEmpWage =  WagePerHour *FulldayHour ;
            System.out.println("Employee is Present and Employee Daily Wage is " + DailyEmpWage);
        }
        else
            System.out.println("Employee is Absent");
    }
}
