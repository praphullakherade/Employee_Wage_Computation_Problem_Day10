package com.employeewage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

    protected final String company;
    protected final int WAGE_PER_HR;
    protected final int MAX_WORKING_DAYS;
    protected final int MAX_HRS_IN_MONTH;

    public EmployeeWageChildClass(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH){
        this.company=company;
        this.WAGE_PER_HR=WAGE_PER_HR;
        this.MAX_WORKING_DAYS=MAX_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
    }

    //calculating Wages For Working Hour And Days
    protected int wagesForWorkingHourAndDays(){

        while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS && TOTAL_EMP_HRS < MAX_HRS_IN_MONTH){
            getRandomNumber();
            employeeWageUsingSwitch(randomCheck);
            TOTAL_WORKING_DAYS++;
        }
        TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
        return TOTAL_SALARY;
    }
    @Override
    public String toString(){
        return "Total Employee wage for company "+company+" is : "+TOTAL_SALARY;
    }

}