package com.horstmannn.corejava;

import java.time.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String aName, double aSalary, int year, int month, int day) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        this.salary = this.salary * (1+0.01*byPercent);
    }
}
