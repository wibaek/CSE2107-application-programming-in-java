package com.wibaek.week7;

import java.util.Iterator;
import java.util.Vector;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Lab07_1 {
    public static void main(String[] args) {
        Vector<Point> points = new Vector<>();
        points.add(new Point(5, 16));
        points.add(new Point(2, 12));
        points.add(new Point(11, 4));

        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            System.out.println("Point: (" + point.x + ", " + point.y + ")");
        }
    }
}
