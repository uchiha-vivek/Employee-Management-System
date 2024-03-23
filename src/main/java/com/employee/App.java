package com.employee;

import java.util.ArrayList;
// making an abstract class for employeee

abstract class Employee {

    private String name;
    private int id;

    // making use of constructor

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Using getters and setters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double checkSalary();

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + ",salary=" + checkSalary() + " ]";
    }

}

// Making Full time employeeList;

class FulltimeEmployee extends Employee {

    private double monthlySalary;

    // making constructor for full time employeeList;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double checkSalary() {
        return monthlySalary;
    }

}

// Making interns

class Intern extends Employee {

    private double hoursWorked;
    private double perHourWage;

    // making constructor for intern
    public Intern(String name, int id, double hoursWorked, double perHourWage) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.perHourWage = perHourWage;
    }

    @Override
    public double checkSalary() {
        return hoursWorked * perHourWage;
    }
}

    // Making payroll system

    // class PayrollSystem {

    // private ArrayList<Employee> employeeList;

    // // making constructor
    // public PayrollSystem(){
    // employeeList = new ArrayList<>();
    // }

    // // adding employess

    // public void addEmployee(Employee employee){
    // employeeList.add(employee);
    // }

    // // removing employee
    // public void removeEmployee( int id){
    // Employee employeeToRemove = null;
    // for(Employee employee : employeeList){
    // if(employee.getId()== id){
    // employeeToRemove=employee;
    // break;
    // }
    // if(employeeToRemove != null){
    // employeeList.remove(employeeToRemove);
    // }
    // }

    // }
    // // getting all the employess

    // public void displayEmployees(){
    // for(Employee employee :employeeList){
    // System.out.println(employee);
    // }
    // }

    // }

    // }

    class PayrollSystem {
        private ArrayList<Employee> employeeList;

        public PayrollSystem() {
            employeeList = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employeeList.add(employee);
        }

        public void removeEmployee(int id) {
            Employee employeeToRemove = null;
            for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    employeeToRemove = employee;
                    break;
                }
            }
            if (employeeToRemove != null) {
                employeeList.remove(employeeToRemove);
            }
        }

        public void displayEmployees() {
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }
        }
    }

public class App{
    public static void main(String[] args)
    {
         PayrollSystem obj = new PayrollSystem();
         FulltimeEmployee emp = new FulltimeEmployee("prit",1,60000);
         Intern itn = new Intern("Emanuel",2,6,2000);
         
         obj.addEmployee(emp);
         obj.addEmployee(itn);
         System.out.println("Employee Details");
         obj.displayEmployees();
         System.out.println("Remove employee");
         obj.removeEmployee(2);
         System.out.println("Employess still present");
         obj.displayEmployees();
         
    }
}
