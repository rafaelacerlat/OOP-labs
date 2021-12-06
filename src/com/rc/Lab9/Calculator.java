package com.rc.Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ArithmeticException;

public class Calculator {

    public Calculator() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(7,1,5, 5));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");

        JLabel label1 = new JLabel("First number: ");
        panel.add(label1);
        JTextField input1 = new JTextField();
        panel.add(input1);

        JLabel label2 = new JLabel("Second number: ");
        panel.add(label2);
        JTextField input2 = new JTextField();
        panel.add(input2);

        JButton divide = new JButton("/ divide");
        panel.add(divide);

        JLabel result = new JLabel("Result: ");
        panel.add(result);
        JTextField answer = new JTextField();
        panel.add(answer);


        class UnluckyException extends Exception {}

        divide.addActionListener(e -> {

            try{
                double num1, num2, ans;
                num1 = Double.parseDouble(input1.getText());
                num2 = Double.parseDouble(input2.getText());
                ans = num1 / num2;
                if (Double.isInfinite(ans))
                    throw new ArithmeticException();
                if (num2 == 13)
                    throw new UnluckyException();
                answer.setText(Double.toString(ans));
            }

            catch (UnluckyException exception1){
                JOptionPane.showMessageDialog(null, "Can't divide by 13");
            }

            catch (ArithmeticException exception){
                JOptionPane.showMessageDialog(null, "Enter valid number");
            }

        });

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
