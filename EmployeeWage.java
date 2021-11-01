package com.employeewage;

import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HR = 20;
        int EMP_HRS;
        int TotalWageInDay;
        Random num = new Random();
        int randomCheck = num.nextInt(3);
        if (IS_FULL_TIME == randomCheck)
            EMP_HRS = 8;
        else if (IS_PART_TIME == randomCheck)
            EMP_HRS = 4;
        else
            EMP_HRS =0;
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }
}
