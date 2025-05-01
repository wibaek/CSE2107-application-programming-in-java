package com.wibaek.week5;

public class Lab05_1 {
    public static void main(String[] args) {
        Student s = new Student("dlwlrma", "930516-2xxxxxx", 12341234);
        System.out.println("name: " + s.getName());
        System.out.println("ssn: " + s.getSsn());
        System.out.println("id: " + s.getId());
    }
}


class Student {
    private String name;
    private String ssn;
    private int id;

    public Student(String name, String ssn, int id) {
        this.name = name;
        this.ssn = ssn;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getSsn() {
        return ssn;
    }
    public int getId() {
        return id;
    }
}


