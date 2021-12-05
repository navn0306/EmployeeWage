package com.bridge.CompanyEmployeeWage;

public class CompanyEmployeeWage {

    public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maxHoursPerMonth;
    public int totalEmpWage = 0;

    public CompanyEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {

        this.totalEmpWage = totalEmpWage;
    }

    public String toString() {
        return "Total Employee Wage for Company " + company + " is " + totalEmpWage;
    }

}