package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

  public class SalariedEmployee extends Employee  {

  private double salary;

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {

    super(name, hireDate);
  }

  public SalariedEmployee(String name, LocalDate hireDate, double salary){
    this(name, hireDate);
    this.salary = salary;

  }



    @Override
    public void pay() {
      System.out.printf("%s is paid salary %,.2f, \n", getName(), getSalary() );
    }




    @Override
  public String toString() {

//    return "Name: " + getName() + " HireDate: " + getHireDate() + " Salary: " + getSalary() ;
    return String.format("%s, Salary: %,.2f.", super.toString(), getSalary());

  }


    @Override
    public void payTaxes() {
      System.out.printf("%s paid taxes of %,.2f %n", getName(), salary * SALARIED_TAX_RATE);
    }
  }
