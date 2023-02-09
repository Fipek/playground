package com.fipek.playground.solid.dependencyinversion.exampletwo;

import java.util.List;

public class Notification {
    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender(){
        messages.forEach(Message::sendMessage);
    }
}

