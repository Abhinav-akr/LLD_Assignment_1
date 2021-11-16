package com.payroll.model;

public class FullTimeEmployeeTax implements Taxable{

    @Override
    public double calculateTax(double salary) {
        return 0.3*salary + 0.03*salary + 0.02*salary;
    }
}
