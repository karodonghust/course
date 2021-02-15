package com.designPattern.observerPattern;

import com.designPattern.observerPattern.observer.Observer;
import com.designPattern.observerPattern.observer.impl.BigStudent;
import com.designPattern.observerPattern.observer.impl.SmallStudent;
import com.designPattern.observerPattern.subject.Subject;
import com.designPattern.observerPattern.subject.impl.Teacher;

public class ObserverPattern {


    public static void main(String[] args) {
        Subject<Observer> teacher = new Teacher();
        Observer smallStudent = new SmallStudent();
        Observer bigStudent = new BigStudent();

        teacher.registerObserver(smallStudent);
        teacher.registerObserver(bigStudent);
        teacher.setMessage("这是一个测试通知");
    }
}
