package com.bigJavaExercises.Chapter12Exercises.Email;

import java.util.ArrayList;

public class EmailMessageList {
    public ArrayList<EmailMessage> emailMessages;
    private EmailMessage message;
    public EmailMessageList() {
        emailMessages = new ArrayList<>();
    }

    public void addEmailMessage(EmailMessage message) {
        emailMessages.add(message);
    }
}
