package com.example.cicd;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO
{
    private static Employees list = new Employees();

    static
    {
        list.getEmployeeList().add(new Employee(1, "Wahid", "Khan", "wahid.khan74@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
        list.getEmployeeList().add(new Employee(4, "Sam", "Kameron", "sam@gmail.com"));
        list.getEmployeeList().add(new Employee(5, "John", "Smith", "john@gmail.com"));
    }

    public Employees getAllEmployees()
    {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}