package com.bridge.EmployeeWage;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;


    public static int calcEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {
        //VARIABLES
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;


        while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {

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
        }
        int totalEmpWage = totalEmpHrs * empRate;
        System.out.println("Total Emp Wage for company : " + company + " is :" + totalEmpWage);
        return totalEmpWage;

    }

    public static void main(String[] args) {

        int totalWage1 = calcEmpWageForCompany("Dmart", 20, 2, 10);
        int totalWage2 = calcEmpWageForCompany("Reliance", 10, 4, 20);

    }
}