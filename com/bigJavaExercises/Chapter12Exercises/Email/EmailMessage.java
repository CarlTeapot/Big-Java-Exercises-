package com.bigJavaExercises.Chapter12Exercises.Email;

public class EmailMessage {
    private String message;
    private String sender;
    private String recipient;

    public EmailMessage(EmailAccount theSender, EmailAccount theRecipient, String greeting, String yourName, String theMessage) {
        sender = theSender.getAccountName();
        recipient = theRecipient.getAccountName();
        message = "[From "+ theSender.getAccountName() + "]" +
                "\n[To " + theRecipient.getAccountName() + "]\n["
                + greeting + "]\n[" + theMessage +
                "]\n[Ketili survilebit, " + yourName + "]";
    }
    public String getSender() {
        return sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public String getMessage() {
        return  message;
    }
}
