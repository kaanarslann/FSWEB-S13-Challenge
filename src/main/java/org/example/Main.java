package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] devNames = {"aa", "bb", "cc"};
        String[] healthPlans = {"11", "22", "33"};
        Company company = new Company(150, "A Company", 150.50, devNames);
        Healthplan healthplan = new Healthplan(55, "Name", Plan.BASIC);
        Employee employee = new Employee(80, "Kaan Arslan", "testmail@test", "123456", healthPlans);

        System.out.println(company.toString());
        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
    }
}