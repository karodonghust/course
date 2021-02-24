package com.designPattern.iteratorPattern;

import java.util.Iterator;

public class ClassBIterator implements Iterator {
    Student[] students;
    int position = 0;

    public ClassBIterator(Student[] students){
        this.students = students;
    }
    @Override
    public boolean hasNext() {
        if(position>=students.length || students[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Student student = students[position];
        position++;
        return student;
    }
}
