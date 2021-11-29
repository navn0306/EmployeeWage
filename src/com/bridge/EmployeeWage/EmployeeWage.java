package com.bridge.EmployeeWage;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        //VARIABLES
        int empHrs = 0, totalEMPHRS = 0, totalWorkingDays = 0;


        while (totalEMPHRS <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {

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
            totalEMPHRS += empHrs;
        }
        int total_Emp_Wage = totalEMPHRS * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + total_Emp_Wage);

    }
}
