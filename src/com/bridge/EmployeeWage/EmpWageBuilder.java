package com.bridge.EmployeeWage;

public class EmpWageBuilder implements CompanyWage {
    public void calculateWage(int companyNumber){
        CompanyWage.calculateWage(companyNumber );
    }
    public static void main(String[] args){
        EmpWageBuilder[] empWageBuilder = new EmpWageBuilder[5];
        for(int i = 0; i < 5 ; i++ ){
            empWageBuilder[i] = new EmpWageBuilder();
            empWageBuilder[i].calculateWage(i+1);
        }

    }
}
