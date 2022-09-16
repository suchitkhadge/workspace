/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.HourlyEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 5000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 40, 50));
        //TODO Create at least 1 HourlyEmployee and 1 SalariedEmployee, passing it to addEmployee method.

        dept.addEmployee(new SalariedEmployee("Sean Solz", LocalDate.of(2017,5,15), 50000));
        dept.addEmployee(new HourlyEmployee("Michael Ballini", LocalDate.of(2019,5,14), 4, 50));
        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Salary
        System.out.println("\nEmployee payout:");
        dept.payEmployees();
    }
}