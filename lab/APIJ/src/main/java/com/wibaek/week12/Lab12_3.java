package com.wibaek.week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Lab12_3 extends JFrame {
    private List<Integer> xList = new ArrayList<>();
    private List<Integer> yList = new ArrayList<>();
    private MyPanel panel = new MyPanel();

    Lab12_3() {
        super("Draw Polygon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(panel);

        setSize(300, 300);
        setVisible(true);
    }

    private class MyPanel extends JPanel {
        MyPanel() {
            this.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    int x = e.getX();
                    int y = e.getY();

                    xList.add(x);
                    yList.add(y);
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            int[] xPoints = xList.stream().mapToInt(i -> i).toArray();
            int[] yPoints = yList.stream().mapToInt(i -> i).toArray();
            g.drawPolygon(xPoints, yPoints, xList.size());
        }
    }

    public static void main(String[] args) {
        new Lab12_3();
    }
}
