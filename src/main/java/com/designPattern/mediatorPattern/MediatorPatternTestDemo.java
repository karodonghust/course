package com.designPattern.mediatorPattern;

public class MediatorPatternTestDemo {

    public static void main(String[] args) {
        User Karo = new User("Karo");
        User xiaoMei = new User("xiaoMei");
        User someBody = new User("someBody");

        QQChatRoom chatRoom = QQChatRoom.getInstance();

        Karo.registe(chatRoom);
        xiaoMei.registe(chatRoom);
        someBody.registe(chatRoom);

        Karo.sendMessage("xiaoMei", "I really miss u");

        Karo.publicMessage("Where r u XiaoMei?");
    }
}
