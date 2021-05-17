package com.mailsender;

public class MailSenderAdapter {

    /* Design pattern: adapter */
    // Problema: importam o biblioteca externa, pe care vrem sa o folosim in sistemul nostru
    // Peste ceva vreme, vrem sa schimbam biblioteca, dar cea noua are cu totul alte clase si metode.

    public static void main(String[] args) {
        MailAdapter mailAdapter = MailAdapter.getInstance();
        mailAdapter.sendEmail("test@email.com", "java@anc.ro", "We are doing Java", true);
        mailAdapter.receiveEmail();

    }
}
