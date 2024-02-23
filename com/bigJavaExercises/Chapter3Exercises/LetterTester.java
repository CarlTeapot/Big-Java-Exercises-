package com.bigJavaExercises.Chapter3Exercises;

class Letter {
    private String sender;
    private String recipient;
    private String body;

    public Letter(String from, String to) {
        this.body = "";
        this.sender = from;
        this.recipient = to;

    }

    public void addLine(String line) {
        body = body + line + "\n";
    }

    public String getText() {
        String text = "Dear " + recipient + ":\n\n";
        text += body + "\nSincerely,\n\n" + sender + ".";
        return text;
    }
}
public class LetterTester {
    public static void main(String[] args) {
    Letter letter = new Letter("me", "achi");
    letter.addLine(" Achi Achi Achiko Achi Achi");
    letter.addLine("bijo gamarjveba saitaa?");

        System.out.println(letter.getText());
    }
}
