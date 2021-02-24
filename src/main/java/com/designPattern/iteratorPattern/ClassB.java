package com.designPattern.iteratorPattern;

import java.util.Iterator;

public class ClassB implements NormalClass{
    private Student[] students;

    public ClassB(){
        students = new Student[6];
        students[0] = new Student("Caro",11);
        students[1] = new Student("Daro",12);
        students[2] = new Student("Earo",13);
    }

    public Student[] getStudents() {
        return students;
    }

    public Iterator getIterator(){
        return new ClassBIterator(students);
    }
}
