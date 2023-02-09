package com.fipek.playground.solid.dependencyinversion.exampletwo;

public class Sms implements Message {
    public void sendSms(){
        // Send sms
    }

    @Override
    public void sendMessage() {
        // Send sms
    }
}
