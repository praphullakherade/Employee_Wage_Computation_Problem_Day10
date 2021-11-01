package com.employeewage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

    //calculating Wages For Working Hour And Days
    protected void wagesForWorkingHourAndDays(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH){

        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS && TOTAL_EMP_HRS < MAX_HRS_IN_MONTH){
            getRandomNumber();
            employeeWageUsingSwitch(MAX_HRS_IN_MONTH);
            TOTAL_WORKING_DAYS++;
        }
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        System.out.println("Total Employee wage for company "+company+" is : "+TOTAL_SALARY);
    }

}