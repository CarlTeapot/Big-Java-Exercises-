package com.bigJavaExercises.Chapter12Exercises.Email;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailAccount {
    private String emailName;
    private String text;
    private String accountInterface;
    private int password;
    private EmailMessageList messageList;
    private ArrayList<EmailMessage> messages;
    private String accountMessageList;
    private int command;
    private Scanner scanner;
    private ArrayList<String> messageTexts;
    private String zura;
//    private ArrayList<Integer> messageCommands;
    public EmailAccount(String name, int aPassword) {
        emailName = name;
        text = "";
        accountInterface = "";
        password = aPassword;
        messages = new ArrayList<>();
        messageList = new EmailMessageList();
        accountMessageList = "";
        scanner = new Scanner(System.in);
        command = 0;
        messageTexts = new ArrayList<>();
    }

    public String getAccountName() {
        return emailName;
    }
    private boolean login(int aPassword) {
        return password == aPassword;
    }
    public String accountMessages(EmailMessageList aMessageList) {
        messageList = aMessageList;
        for (int i = 0; i < messageList.emailMessages.size(); i++) {

            messageTexts.add(messageList.emailMessages.get(i).getMessage());
            if (messageList.emailMessages.get(i).getSender().equals(emailName)) {
                messages.add(messageList.emailMessages.get(i));
                accountMessageList = accountMessageList + "[From " + messages.get(i).getSender() +
                        " || To " + messages.get(i).getRecipient() + "] ~ " + i + "\n";
            }
            if (messageList.emailMessages.get(i).getRecipient().equals(emailName)) {
                messages.add(messageList.emailMessages.get(i));
                accountMessageList = accountMessageList + "[From " + messages.get(i).getSender() +
                        " || To " + messages.get(i).getRecipient() + "] ~ " + i + "\n";
            }
        }
        return accountMessageList;
    }

    public String emailInterface(int aPassword) {
        login(aPassword);
        if (!login(aPassword)) {
            return "[incorrect password, login again]";
        }
        accountInterface = "[Account Name: " + emailName + "]" + "        " +
                "   [" + LocalDate.now().toString() + "]" +
                "      [" + LocalTime.now().toString() + "]\n"
                + "[Password: " + password + "]\n" + accountMessageList;
        return accountInterface;
    }

    public void chooseMessage() {
        System.out.println("[Choose the Message to check]");

        command = scanner.nextInt();
        if(command<messageTexts.size() && command >=0)
            System.out.println(messageTexts.get(command));
    }
}
