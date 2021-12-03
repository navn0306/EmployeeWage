package com.bridge.EmployeeWage;

public class CalculateWage implements FirstCompanyWage, SecondCompanyWage {
    public static void main(String[] args){
        FirstCompanyWage.calculateWage();
        SecondCompanyWage.calculateWage();
    }
}
