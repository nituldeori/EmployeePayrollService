package com.employeepayrollservice;

import java.util.Scanner;

public class EmployeePayroll {
    private int id;
    private String name;
    private long salary;
    EmployeePayroll(int id, String name, long salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the employee name");
        String name=sc.nextLine();
        System.out.println("Enter the employee salary");
        long salary=sc.nextLong();
        EmployeePayroll EP=new EmployeePayroll(id,name,salary);
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}
