package com.bigJavaExercises.Chapter10Exercises;

import com.bigJavaExercises.Chapter9Exercises.AddInterestListener;
import com.bigJavaExercises.Chapter11Exercises.BankAccount;

import javax.swing.*;
import java.awt.event.ActionListener;

public class InvestmentFrame extends JFrame {
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 300;
    private final int INITIAL_BALANCE = 100;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private BankAccount account;
    public InvestmentFrame()
    {
        account = new BankAccount(INITIAL_BALANCE);
// Use instance variables for components
        label = new JLabel("balance: " + account.getBalance());
// Use helper methods
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    private void createButton() {
        button = new JButton("Add Interest");
        ActionListener listener = new AddInterestListener(account);
        button.addActionListener(listener);
    }
    private void createPanel()
    {
        panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);
    }

}
