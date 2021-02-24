package com.designPattern.iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA implements NormalClass{
    private ArrayList<Student> students;

    public ClassA(){
        students = new ArrayList<>();
        students.add(new Student("karo",11));
        students.add(new Student("Aaro",12));
        students.add(new Student("Baro",13));
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Iterator getIterator(){
        return students.iterator();
    }
}
