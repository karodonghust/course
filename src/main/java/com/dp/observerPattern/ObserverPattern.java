package com.dp.observerPattern;

import com.dp.observerPattern.observer.Observer;
import com.dp.observerPattern.observer.impl.BigStudent;
import com.dp.observerPattern.observer.impl.SmallStudent;
import com.dp.observerPattern.subject.Subject;
import com.dp.observerPattern.subject.impl.Teacher;

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
