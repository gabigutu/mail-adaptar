package com.mailsender;

public class SendGrid {

    // provine de la SendGrid (din API-ul lor) (din exterior)
    private boolean authenticated;

    public void authenticate(String privateKey, String username) {
        // ...
    }

    public void send(String message, String to, String from, boolean secured) {
        // apeluri rest - fac ei in spate
        if (!authenticated) return;
        System.out.println("SendGrid: I am sending an email");
    }

    public void receive() {
        System.out.println("SendGrid: I am receiving an email");
    }



}
