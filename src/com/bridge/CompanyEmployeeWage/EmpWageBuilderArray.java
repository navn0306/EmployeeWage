package com.bridge.CompanyEmployeeWage;

public class EmpWageBuilderArray {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmployeeWage[] companyEmpWageArray;

    public EmpWageBuilderArray() {
        companyEmpWageArray = new CompanyEmployeeWage[5];
    }

    private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        companyEmpWageArray[numOfCompany] = new CompanyEmployeeWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmpWage(CompanyEmployeeWage companyEmployeeWage) {
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
    }
}

