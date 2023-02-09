package com.fipek.playground.solid.dependencyinversion.exampletwo;

public class Email implements Message {
    public void sendEmail(){
        // Send email
    }

    @Override
    public void sendMessage() {
        //send email
    }
}
