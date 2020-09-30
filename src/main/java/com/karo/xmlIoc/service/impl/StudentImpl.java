package com.karo.xmlIoc.service.impl;

import com.karo.xmlIoc.service.ClassRoom;
import com.karo.xmlIoc.service.School;
import com.karo.xmlIoc.service.Student;

public class StudentImpl implements Student {
    private String name;
    private int age;
    private School school;
    private ClassRoom classRoom;

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                ", classRoom=" + classRoom +
                '}';
    }
}
