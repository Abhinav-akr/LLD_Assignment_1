package com.payroll.client;

import com.payroll.model.*;

public class Client {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Abhinav", "E124", 60000.5, new FullTimeEmployeeTax());
        Employee partTime = new PartTimeEmployee("Akash", "P121", 25000, new PartTimeEmployeeTax());
        Employee intern = new InternEmployee("Dikshant", "I119", 10000, new InternEmployeeTax());

        System.out.println(fullTime.getName() + ": " + fullTime.calculateTax());
        System.out.println(partTime.getName() + ": " + partTime.calculateTax());
        System.out.println(intern.getName() + ": " + intern.calculateTax());
    }
}
