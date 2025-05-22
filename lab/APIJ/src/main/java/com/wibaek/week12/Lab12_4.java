package com.wibaek.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lab12_4 extends JFrame {
    private MyPanel panel = new MyPanel();

    Lab12_4() {
        super("dlwlrma.jpg");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(panel);

        setSize(500, 500);
        setVisible(true);
        getContentPane().setFocusable(true);
        getContentPane().requestFocus();
    }

    class MyPanel extends JPanel {
        private int x = 10;
        private int y = 10;
        private int size = 350;

        private ImageIcon icon = new ImageIcon("images/dlwlrma.jpg");
        private Image img = icon.getImage();

        MyPanel() {
            MyMouseListener ml = new MyMouseListener();
            addMouseListener(ml);
            addMouseMotionListener(ml);

            addKeyListener(new KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent e) {
                    int key = e.getKeyChar();
                    if (key == '+') {
                        size *= 1.1;
                    } else if (key == '-') {
                        size *= 0.9;
                    }
                    paintComponent(getGraphics());
                }
            });
        }

        private class MyMouseListener extends MouseAdapter {
            private Point startP = null;
            private boolean isMove = false;

            public void mousePressed(MouseEvent e) {
                startP = e.getPoint();
                if (startP.x >= x && startP.x <= x + size && startP.y >= y && startP.y <= y + size) {
                    isMove = true;
                }
            }

            public void mouseReleased(MouseEvent e) {
                isMove = false;
            }

            public void mouseDragged(MouseEvent e) {
                if (isMove) {
                    Point endP = e.getPoint();
                    x += endP.x - startP.x;
                    y += endP.y - startP.y;
                    startP = endP;
                    repaint();
                }
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, x, y, size, size, this);
        }
    }


    public static void main(String[] args) {
        new Lab12_4();
    }
}
