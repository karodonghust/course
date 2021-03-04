package com.designPattern.mediatorPattern;


import java.util.HashMap;
import java.util.Map;

public class QQChatRoom implements ChatRoom {
    private Map<String, User> userMap;
    private static volatile QQChatRoom uniqueInstance;


    private QQChatRoom() {
        userMap = new HashMap();
    }

    public static QQChatRoom getInstance() {
        if (uniqueInstance == null) {
            synchronized (QQChatRoom.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new QQChatRoom();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public void registeUser(User user) {
        userMap.put(user.name, user);
    }


    @Override
    public void sendMessage(User sender, String getterName, String message) {
        if (userMap.containsKey(sender.name) && userMap.containsKey(getterName)) {
            User getter = userMap.get(getterName);
            getter.recieveMessage(sender, message);
        } else {
            System.out.println("sender or getter hasn`t registed");
        }
    }

    @Override
    public void publicMessage(User sender, String message) {
        userMap.forEach((name, user) -> {
            user.recieveMessage(sender, message);
        });
    }
}
