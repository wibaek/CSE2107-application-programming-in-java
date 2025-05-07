package com.wibaek.week10;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ColorFrame extends JFrame {
    ColorFrame() {
        super("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 9));
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setBackground(new Color(
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255),
                    (int) (Math.random() * 255)));
            button.setOpaque(true);
            button.setBorderPainted(false);
            contentPane.add(button);
        }

        setSize(900,300);
        setVisible(true);
    }
    }

public class Lab10_1 {
    public static void main(String[] args) {
        JFrame mf = new ColorFrame();
    }
}
