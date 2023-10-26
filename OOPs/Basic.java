import java.util.Scanner;

class Employee {
    // class members / data members
    int empId;
    String empName;
    String empAddress;
    String empDesignation;
    double empSalary;

    //methods
    void scanEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Id: ");
        empId = sc.nextInt();

        sc.nextLine();  // to consume the \n character
        System.out.println("Enter Employee Name: ");
        empName = sc.nextLine();

        // sc.nextLine();
        System.out.print("Enter Employee Address: ");
        empAddress = sc.nextLine();

        // sc.nextLine();
        System.out.print("Enter Employee Designation: ");
        empDesignation = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        empSalary = sc.nextDouble();
    }

    void printEmployeeDetails() {
        System.out.println(empId + "\t" + empName + "\t" + empAddress + "\t" + empDesignation + "\t" + empSalary);
    }
}

public class Basic {
    public static void main(String[] args) {
        // Employee emp = new Employee();

        // emp.scanEmployeeDetails();
        // System.out.println("Employee Details: ");
        // System.out.println("Id\tName\tAddress\t\tDesignation\tSalary");
        // emp.printEmployeeDetails();
        
        //data type array_name = new data_type(size);
        Employee emp[] = new Employee[3];

        //Instantiation of objects
        // emp[0] = new Employee();
        // emp[1] = new Employee();
        // emp[2] = new Employee();

        // emp[0].scanEmployeeDetails();
        // emp[1].scanEmployeeDetails();
        // emp[2].scanEmployeeDetails();

        // emp[0].printEmployeeDetails();
        // emp[1].printEmployeeDetails();
        // emp[2].printEmployeeDetails();

        for(int i = 0; i < 3; i++) {
            emp[i] = new Employee();
            System.out.println("Enter Employee " + (i+1) + " Details:\n");
            emp[i].scanEmployeeDetails();
        }

        System.out.println("Employee Details: ");
        System.out.println("Id\tName\tAddress\t\tDesignation\tSalary");
        for(int i = 0; i < 3; i++) {
            emp[i].printEmployeeDetails();
        }
    }
}
/*
Task:

Class Student:
attributes: rollNo, name, address, marks

scan and print the details of 6 students

*/