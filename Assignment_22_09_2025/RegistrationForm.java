package com.form1;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    JLabel nameLabel = new JLabel("Names");
    JLabel userLabel = new JLabel("UserName");
    JLabel passLabel = new JLabel("Password");

    JTextField nameField = new JTextField();
    JTextField userField = new JTextField();
    JPasswordField passField = new JPasswordField();

    JButton registerBtn = new JButton("Register");
    JButton resetBtn = new JButton("Reset");

    public RegistrationForm() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(100, 100, 400, 250);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    private void setLocationAndSize() {
        nameLabel.setBounds(30, 30, 100, 30);
        nameField.setBounds(150, 30, 200, 30);

        userLabel.setBounds(30, 70, 100, 30);
        userField.setBounds(150, 70, 200, 30);

        passLabel.setBounds(30, 110, 100, 30);
        passField.setBounds(150, 110, 200, 30);

        registerBtn.setBounds(70, 160, 100, 30);
        resetBtn.setBounds(200, 160, 100, 30);
    }

    private void addComponentsToFrame() {
        frame.add(nameLabel);
        frame.add(userLabel);
        frame.add(passLabel);

        frame.add(nameField);
        frame.add(userField);
        frame.add(passField);

        frame.add(registerBtn);
        frame.add(resetBtn);
    }

    private void addActionEvent() {
        registerBtn.addActionListener(this);
        resetBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerBtn) {
            String name = nameField.getText();
            String username = userField.getText();
            String password = new String(passField.getPassword());

            System.out.println("Registered:");
            System.out.println("Name: " + name);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else if (e.getSource() == resetBtn) {
            nameField.setText("");
            userField.setText("");
            passField.setText("");
        }
    }
}

