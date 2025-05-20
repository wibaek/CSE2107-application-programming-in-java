package com.wibaek.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ClickCFrame extends JFrame {
    private static final int C_SIZE = 50;
    private JLabel c = new JLabel("c");

    private int getRandomXCoord() {
        int rand = (int) (Math.random() * (getWidth() - C_SIZE));
        return Math.max(rand, 0);
    }

    private int getRandomYCoord() {
        int rand = (int) (Math.random() * (getHeight() - C_SIZE));
        return Math.max(rand, 0);
    }

    ClickCFrame() {
        setTitle("Click \"C\"");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        c.addMouseListener(new CClickListener());

        container.setLayout(null);
        c.setSize(50, 20);
        c.setLocation(30, 30);
        container.add(c);

        setSize(250, 250);
        setVisible(true);
    }

    private class CClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = getRandomXCoord();
            int y = getRandomYCoord();
            c.setLocation(x, y);
        }

    }
}

public class Lab10_3 {

    public static void main(String[] args) {
        JFrame frame = new ClickCFrame();
    }
}
