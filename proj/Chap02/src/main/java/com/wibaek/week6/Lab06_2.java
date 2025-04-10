package com.wibaek.week6;



class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Point p = (Point) obj;
        if (x != p.x) {
            return false;
        }
        if (y != p.y) {
            return false;
        }
        return true;
    }
}

class Circle extends Point {
    int r;

    Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", r = " + r;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Circle c = (Circle) obj;
        if (r != c.r) {
            return false;
        }
        return super.equals(obj);
    }
}

public class Lab06_2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 4, 5);
        Circle c2 = new Circle(3, 4, 5);
        Circle c3 = new Circle(3, 4, 6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.print("c1 ");
        if (c1.equals(c2)) {
            System.out.print("==");
        } else {
            System.out.print("!=");
        }
        System.out.println(" c2");

        System.out.print("c1 ");
        if (c1.equals(c3)) {
            System.out.print("==");
        } else {
            System.out.print("!=");
        }
        System.out.println(" c3");
    }

}
