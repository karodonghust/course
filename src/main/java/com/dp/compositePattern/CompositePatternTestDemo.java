package com.dp.compositePattern;

public class CompositePatternTestDemo {

    public static void main(String[] args) {
        Employee boss = new Employee("boss", "0", 10);
        boss.add(new Employee("a", "1", 9));
        boss.add(new Employee("b", "1", 9));
        boss.add(new Employee("c", "1", 9));
        boss.add(new Employee("d", "1", 9));
        boss.add(new Employee("e", "1", 9));
        boss.printEmployee();
    }
}
