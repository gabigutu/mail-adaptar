package com.mailsender;

public class Mailgun {

    // provine de la Mailgun

    public void sendMail(String from, String to, String message) {
        System.out.println("Mailgun: Sending email...");
    }

    public void receiveMail() {
        System.out.println("Mailgun: Receiving email...");
    }

    public void createDraft(String message) {
        System.out.println("Mailgun: Creating draft...");
    }

}
