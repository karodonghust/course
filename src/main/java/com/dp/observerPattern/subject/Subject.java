package com.dp.observerPattern.subject;

public interface Subject<T> {

    public void registerObserver(T object);

    public void removeObserver(T object);

    public void notifyObserver();

    public void setMessage(String message);
}
