package com.wibaek.week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ColorfulFrame extends JFrame {

    private Color getRandomColor() {
        return new Color(
                (int) (Math.random() * 255),
                (int) (Math.random() * 255),
                (int) (Math.random() * 255));
    }

    private Container container;

    ColorfulFrame() {
        setTitle("Click \"C\"");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);
        container.addMouseListener(new CreateColorListener());

        setSize(250, 250);
        setVisible(true);

    }

    class CreateColorListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();

            JLabel newLabel = new JLabel("");
            newLabel.setLocation(x, y);
            newLabel.setSize(5, 5);
            newLabel.setOpaque(true);
            newLabel.setBackground(getRandomColor());

            Container container = (Container) e.getSource();
            container.add(newLabel);
            container.revalidate();
            container.repaint();

        }
    }
}

public class Lab10_5 {

    public static void main(String[] args) {
        JFrame frame = new ColorfulFrame();
    }
}
