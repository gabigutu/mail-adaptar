package com.mailsender;

public class MailAdapter {

    private SendGrid sendGrid;

    private MailAdapter() {
        sendGrid = new SendGrid();
        // ...
    }
    
    // Singleton: vrem o singura instanta dintr-o anumita clasa, orice ar fi
    // Rezolvare: daca ai deja o instanta, da-mi-o pe aia, daca nu, fa una noua si da-mi-o pe cea creata

    private static MailAdapter mailAdapter = null;

    public static MailAdapter getInstance() {
        if (mailAdapter == null) {
            mailAdapter = new MailAdapter();
        }
        return mailAdapter;
    }

    public void sendEmail(String from, String to, String message) {
        this.sendEmail(from, to, message, true);
    }

    public void sendEmail(String from, String to, String message, boolean secure) {
        sendGrid.send(message, to, from, secure);
    }

    public void receiveEmail() {
        sendGrid.receive();
    }

    public void draftMessage(String message) {
        return;
    }

}
