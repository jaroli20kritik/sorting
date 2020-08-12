package com.company;

class Student {
    // make these members private
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollno() {
        return rollno;
    }
    // if you want, you can also override toString()
}


