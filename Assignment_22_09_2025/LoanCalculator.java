package com.form2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoanCalculator implements ActionListener {
    JFrame frame;
    JLabel amountLabel = new JLabel("Amount requested");
    JLabel durationLabel = new JLabel("Duration (year)");
    JLabel totalLabel = new JLabel("Total to return");

    JTextField amountField = new JTextField();
    JTextField durationField = new JTextField();
    JTextField totalField = new JTextField();

    JButton calculateBtn = new JButton("Calculate");

    public LoanCalculator() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        addActionEvent();
    }

    private void createWindow() {
        frame = new JFrame();
        frame.setTitle("Loan Calculator");
        frame.setBounds(100, 100, 400, 250);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    private void setLocationAndSize() {
        amountLabel.setBounds(30, 30, 120, 30);
        amountField.setBounds(160, 30, 200, 30);

        durationLabel.setBounds(30, 70, 120, 30);
        durationField.setBounds(160, 70, 200, 30);

        totalLabel.setBounds(30, 110, 120, 30);
        totalField.setBounds(160, 110, 200, 30);
        totalField.setEditable(false); // read-only

        calculateBtn.setBounds(130, 160, 120, 30);
    }

    private void addComponentsToFrame() {
        frame.add(amountLabel);
        frame.add(durationLabel);
        frame.add(totalLabel);

        frame.add(amountField);
        frame.add(durationField);
        frame.add(totalField);

        frame.add(calculateBtn);
    }

    private void addActionEvent() {
        calculateBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateBtn) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                int years = Integer.parseInt(durationField.getText());

                // Example: 0.6% interest per year
                double total = amount + (amount * 0.006 * years);

                // Format result without decimals
                totalField.setText(String.valueOf((long) total));
            } catch (NumberFormatException ex) {
                totalField.setText("Invalid input!");
            }
        }
    }
    }