package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate)
  {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
    this(name, hireDate);
    setRate(rate);
    this.hours = hours;

  }

  @Override
  public void pay() {
    System.out.printf("%s is paid hourly for a total of %,.2f %n", getName(), getRate() * getHours(), " \n");
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }


//TODO Declare and implement a constructor that take name, hiredate, rate and hours as parameters.

  //4 arg constructor


  //TODO Override toString method
  @Override
  public String toString() {
//    String name = getName();
//    LocalDate hireDate = getHireDate();
//    rate = getRate();
//    hours = getHours();
//    return "Name: " + getName() + "HireDate: " + getHireDate() + " Rate: " + getRate() +  " Hours: " + getHours();
    return String.format("%s: Name=%s, Hire Date=%s, Rate:%.2f, Hours=%.1f", getClass().getSimpleName(),getName(),getHireDate(), getHours(), getHours());
  }


//  public void pay() {
////    super.pay();
//    System.out.printf("%s hourly= %s", pay() , getRate());
//  }
}
