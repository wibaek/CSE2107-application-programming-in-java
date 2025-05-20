package com.wibaek.week11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

class Frame2 extends JFrame {

    private JLabel label;

    Frame2() {
        super("Wheel your mouse");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, 15));

        label.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int n = e.getWheelRotation();
                if (n > 0) {
                    zoomOut();
                } else {
                    zoomIn();
                }
            }
        });
        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == '+') {
                    zoomIn();
                } else if (e.getKeyChar() == '-') {
                    zoomOut();
                }
            }
        });

        c.add(label);


        setSize(900, 300);
        setVisible(true);

        label.setFocusable(true);
        label.requestFocus();
    }

    private void zoomIn() {
        Font f = label.getFont();
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, f.getSize() + 5));
    }

    private void zoomOut() {
        Font f = label.getFont();
        label.setFont(new Font("Arial", Font.PLAIN, f.getSize() - 5));
    }
}

public class Lab11_2 {

    public static void main(String[] args) {
        JFrame mf = new Frame2();
    }
}
