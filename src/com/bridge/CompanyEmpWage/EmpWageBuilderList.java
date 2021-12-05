package com.bridge.CompanyEmpWage;

import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilderList implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany;
    private List<CompanyEmpWage> companyEmpWageList = new ArrayList<>();

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageList.add(new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth));
        numOfCompany++;
    }

    public void computeEmpWage() {

        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageList.get(i).setTotalEmpWage(this.computeEmpWage(companyEmpWageList.get(i)));
            System.out.println(companyEmpWageList.get(i));
        }
    }

    @Override
    public int getTotalWage(String company) {
        return 0;
    }


    public int computeEmpWage(CompanyEmpWage companyEmployeeWage) {

        //variables
        int day = 0;
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
            } day++;

            totalEmpHrs += empHrs;
            System.out.println("Day# " + totalWorkingDays + " Emp Hr " + empHrs);
            System.out.println("Wage for Day " + day + " is " + empHrs * companyEmployeeWage.empRatePerHour);

        }

        return totalEmpHrs * companyEmployeeWage.empRatePerHour;

    }


    public static void main(String[] args) {
        EmpWageBuilderList empWageBuilder = new EmpWageBuilderList();

        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
        empWageBuilder.addCompanyEmpWage("reliance", 10, 4, 20);
        empWageBuilder.computeEmpWage();
    }
}