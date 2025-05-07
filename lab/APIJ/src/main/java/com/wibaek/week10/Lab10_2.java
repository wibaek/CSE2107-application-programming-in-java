package com.wibaek.week10;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class CalcButtons extends JPanel {
    CalcButtons() {
        setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "CE", "RUN",
                "+", "-", "X", "/"
        };
        for (int i = 0; i < buttons.length; i++) {
            JButton jButton = new JButton(buttons[i]);
            if (i >= 12) {
                jButton.setBackground(Color.CYAN);
            }
            else {
                jButton.setBackground(Color.LIGHT_GRAY);
            }
            jButton.setOpaque(true);
            jButton.setBorderPainted(false);
            add(jButton);
        }
    }
}

class CalcFrame extends JFrame {
    CalcFrame() {
        super("Calculator Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.GRAY);
        northPanel.setLayout(new FlowLayout());
        northPanel.add(new JLabel("Enter formula"));
        northPanel.add(new JTextField(20));
        c.add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.YELLOW);
        southPanel.setLayout(new FlowLayout());
        southPanel.add(new JLabel("Result"));
        southPanel.add(new JTextField(20));
        c.add(southPanel, BorderLayout.SOUTH);

        JPanel calcButtons = new CalcButtons();
        c.add(calcButtons, BorderLayout.CENTER);

        setSize(900,300);
        setVisible(true);
    }
}

public class Lab10_2 {
    public static void main(String[] args) {
        JFrame frame = new CalcFrame();
    }
}
