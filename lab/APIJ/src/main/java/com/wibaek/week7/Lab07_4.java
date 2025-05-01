package com.wibaek.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    String name;
    String birth;
    int height;

    Student (String name, String birth, int height) {
        this.name = name;
        this.birth = birth;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return height == student.height && Objects.equals(name, student.name) && Objects.equals(birth, student.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birth, height);
    }
}

public class Lab07_4 {
    public static void main(String[] args) {
        HashMap<Student, Integer> h = new HashMap<>();
        h.put(new Student("dlwlrma", "930516", 162), 10000);
        h.put(new Student("pby", "900212", 158), 15000);
        h.put(new Student("pby", "000720", 158), 15000);
        h.put(new Student("dlwlrma", "930516", 162), 20000);

        for(Map.Entry<Student, Integer> e : h.entrySet()) {
            Student s = e.getKey();
            int money = e.getValue();
            System.out.println(s.name + " " + s.birth + " " + s.height + " " + money);
        }
    }
}
