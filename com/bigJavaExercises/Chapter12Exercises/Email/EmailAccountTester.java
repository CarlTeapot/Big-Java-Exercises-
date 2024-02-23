package com.bigJavaExercises.Chapter12Exercises.Email;

public class EmailAccountTester {
    public static void main(String[] args) {
        EmailAccount zura = new EmailAccount("zura",123);
        EmailAccount tornike = new EmailAccount("tornike",938);
        EmailMessage zurasMessage = new EmailMessage(zura, tornike, "Hello",
                "Zura Banjgvladze", " rava xar movedi zd magaria gavakue");
        EmailMessage tornikesMessage = new EmailMessage(tornike,zura, "zd she chema",
                "tornike gurchumelia", "gavakue movedi chamexmarey rava xar zd oe");
        EmailMessageList emailMessageList = new EmailMessageList();
        emailMessageList.addEmailMessage(zurasMessage);
        emailMessageList.addEmailMessage(tornikesMessage);

        zura.accountMessages(emailMessageList);
        tornike.accountMessages(emailMessageList);
        System.out.println(tornike.emailInterface(938));
        tornike.chooseMessage();
    }
}
