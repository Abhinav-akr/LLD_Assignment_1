package com.payroll.model;

public class PartTimeEmployeeTax implements Taxable {

    @Override
    public double calculateTax(double salary) {
        return 0.2*salary + 0.05*salary + 0.02*salary;
    }
}
