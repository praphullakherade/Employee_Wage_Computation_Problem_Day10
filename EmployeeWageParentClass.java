package com.employeewage;

import java.util.Random;

public class EmployeeWageParentClass {
    protected String company;
    protected int WAGE_PER_HR;
    protected int MAX_WORKING_DAYS;
    protected int MAX_HRS_IN_MONTH;
    protected int TOTAL_SALARY;

    public EmployeeWageParentClass(){

    }

    public EmployeeWageParentClass(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH){
        this.company=company;
        this.WAGE_PER_HR=WAGE_PER_HR;
        this.MAX_WORKING_DAYS=MAX_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
    }
    public void setTotalEmpWage(int TOTAL_SALARY){
        this.TOTAL_SALARY=TOTAL_SALARY;
    }

    @Override
    public String toString() {
        return "Total Employee wage for company "+company+" is : "+TOTAL_SALARY;
    }
}