package com.bridge.EmployeeWage;

public class EmpWageBuilder implements FirstCompanyWage, SecondCompanyWage {
    public void calculateWage(){
        FirstCompanyWage.calculateWage();
        SecondCompanyWage.calculateWage();
    }
    public static void main(String[] args){
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.calculateWage();
    }
}
