package com.wibaek.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

class Frame3 extends JFrame {

    private JLabel[] labels = new JLabel[10];
    int curNumber = 0;

    Frame3() {
        super("Click 0 to 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        setSize(300, 300);
        setVisible(true);

        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(String.valueOf(i));
            labels[i].setForeground(Color.MAGENTA);
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    JLabel la = (JLabel) e.getSource();
                    if (curNumber == Integer.parseInt(la.getText())) {
                        curNumber++;
                        if (curNumber == 10) {
                            curNumber = 0;
                            configure();
                        } else {
                            la.setVisible(false);
                        }
                    }
                }
            });

            c.add(labels[i]);
        }
        configure();
    }

    private void configure() {
        Container c = getContentPane();
        for (int i = 0; i < labels.length; i++) {
            labels[i].setSize(15, 15);
            int xBound = c.getWidth() - labels[i].getWidth();
            int yBound = c.getHeight() - labels[i].getHeight();
            labels[i].setLocation((int) (Math.random() * xBound), (int) (Math.random() * yBound));
            labels[i].setVisible(true);
        }
    }

}

public class Lab11_3 {

    public static void main(String[] args) {
        JFrame mf = new Frame3();
    }
}
