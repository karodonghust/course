package com.designPattern.compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    //subordinates 下属
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public Iterator getIterator() {
        return subordinates.iterator();
    }

    public void printEmployee() {
        System.out.println(this.toString());
        Iterator<Employee> iterator = getIterator();
        while (iterator.hasNext()){
            iterator.next().printEmployee();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
