package com.bridge.CompanyEmpWage;

import com.sun.java.accessibility.util.EventQueueMonitor;

public class EmpWageBuilderArray implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;


    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {

        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    @Override
    public int getTotalWage(String company) {
        return 0;
    }


    public int computeEmpWage(CompanyEmpWage companyEmployeeWage) {

        //variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= companyEmployeeWage.maxHoursPerMonth && totalWorkingDays < companyEmployeeWage.numOfWorkingDays) {

            totalWorkingDays++;

            double empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# " + totalWorkingDays + "Emp Hr " + empHrs);
        }
        return totalEmpHrs * companyEmployeeWage.empRatePerHour;

    }


    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();
        System.out.println("Total wage for company "+empWageBuilder.getTotalWage("Dmart") );
    }
}