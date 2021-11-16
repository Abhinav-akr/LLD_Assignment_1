package com.payroll.model;

public class InternEmployeeTax implements Taxable{

    @Override
    public double calculateTax(double salary) {
        return 0.2*salary;
    }
}
