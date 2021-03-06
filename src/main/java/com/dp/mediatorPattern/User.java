package com.dp.mediatorPattern;

public class User {
    String name;
    ChatRoom chatRoom;

    public User(String name){
        this.name = name;
    }

    public void recieveMessage(User sender, String message) {
        System.out.println(name + "接收到- " + sender.name + "发来的消息： " + message);
    }

    public void sendMessage(String getterName, String message) {
        QQChatRoom.getInstance().sendMessage(this, getterName, message);
    }

    public void registe(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
        chatRoom.registeUser(this);
    }

    public void publicMessage(String message){
        this.chatRoom.publicMessage(this,message);
    }

}
