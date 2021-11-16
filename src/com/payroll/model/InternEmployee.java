package com.payroll.model;

public class InternEmployee extends Employee{
    Taxable taxCalc;

    public InternEmployee(String name, String employeeID, double salary, Taxable taxCalc) {
        super(name, employeeID, salary);
        this.taxCalc = taxCalc;
    }

    @Override
    public double calculateTax() {
        return taxCalc.calculateTax(this.getSalary());
    }
}
