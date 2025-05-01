package com.wibaek.week6;

import java.util.Objects;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Student s = (Student) obj;
        if (hashCode() != s.hashCode()) {
            return false;
        }
        if (id != s.id) {
            return false;
        }
        if (!name.equals(s.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class Lab06_3 {
    public static void main(String[] args) {
        Student s1 = new Student(16, "dlwlrma");
        Student s2 = new Student(16, "dlwlrma");

        System.out.print("s1 ");

        if (s1.equals(s2)) {
            System.out.print("==");
        } else {
            System.out.print("!=");
        }

        System.out.println(" s2");
    }
}
