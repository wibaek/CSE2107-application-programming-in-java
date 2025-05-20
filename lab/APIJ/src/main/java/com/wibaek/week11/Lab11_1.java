package com.wibaek.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Frame1 extends JFrame {
    
    private JLabel[] labels = new JLabel[3];
    private final int STEP_SIZE = 10;

    Frame1() {
        super("Move clicked name");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        c.addMouseListener(new MyMouseListener());

        labels[0] = new JLabel("dlwlrma");
        labels[1] = new JLabel("pby");
        labels[2] = new JLabel("wook");

        for (int i = 0; i < labels.length; i++) {
            labels[i].setSize(50, 20);
            labels[i].setLocation(i * 50, i * 50);
            labels[i].addMouseListener(new MyMouseListener());
            labels[i].addKeyListener(new MyKeyListener());
            c.add(labels[i]);
        }

        setSize(300, 300);
        setVisible(true);

        labels[1].setFocusable(true);
        labels[1].requestFocus();
    }

    private class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            Component com = (Component) e.getSource();
            com.setFocusable(true);
            com.requestFocus();
        }
    }

    private class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            JLabel la = (JLabel) e.getSource();

            if (keyCode == KeyEvent.VK_UP) {
                la.setLocation(la.getX(), la.getY() - STEP_SIZE);
            } else if (keyCode == KeyEvent.VK_DOWN) {
                la.setLocation(la.getX(), la.getY() + STEP_SIZE);
            } else if (keyCode == KeyEvent.VK_LEFT) {
                la.setLocation(la.getX() - STEP_SIZE, la.getY());
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                la.setLocation(la.getX() + STEP_SIZE, la.getY());
            }
        }
    }
}

public class Lab11_1 {

    public static void main(String[] args) {
        JFrame mf = new Frame1();
    }
}
