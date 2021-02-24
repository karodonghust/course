package com.designPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestDemo {

    public static void main(String[] args) {
        ArrayList<Student> aStudents = new ClassA().getStudents();
        Student[] bStudents = new ClassB().getStudents();

        for(int i=0;i<aStudents.size();i++){
            System.out.println(aStudents.get(i));
        }
        for(int i=0;i<bStudents.length;i++){
            System.out.println(bStudents[i]);
        }
        NormalClass classA = new ClassA();
        NormalClass classB = new ClassB();
        Iterator aIterator = classA.getIterator();
        Iterator bIterator = classB.getIterator();
        while (aIterator.hasNext()){
            System.out.println((Student)aIterator.next());
        }
        while (bIterator.hasNext()){
            System.out.println(bIterator.next());
        }

    }
}
