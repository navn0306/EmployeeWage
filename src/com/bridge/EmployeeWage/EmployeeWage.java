package com.bridge.EmployeeWage;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {

        int empHrs = 0, empWage = 0, total_emp_wage = 0;

        for (int days = 0; days <= NUM_OF_WORKING_DAYS; days++) {

            double empCheck = Math.floor(Math.random() * 10) % 3;

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
            empWage = empHrs * EMP_RATE_PER_HOUR;
            total_emp_wage += empWage;


        }
        System.out.println("EMP Wage :" + empWage);

    }
}
