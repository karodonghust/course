package com.designPattern.mediatorPattern;

public interface ChatRoom {

    public void registeUser(User user);

    public void sendMessage(User sender,String getterName,String message);

    public void publicMessage(User sender,String message);
}
