package com.fipek.playground.solid.dependencyinversion.exampletwo.badversion;

//This is bad approach. Because Notification.class is depend low level classes (Email & Sms) although it is a High Level class.
//Notification.class affected from any changes in Email and Sms classes. In this case, we have acted against the Dependency Inversion principle.

public class Notification {
    private Email email = new Email();
    private Sms sms = new Sms();

    public void sender(){
        email.sendEmail();
        sms.sendSms();
    }
}

