package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentSort {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(59, "kritik", 21));
        list.add(new Student(65, "vatslist", 14));
        list.add(new Student(105, "rakshit", 50));

        Comparator<Student> cm1 = Comparator.comparing(Student::getName);
        list.sort(cm1);
        System.out.println("Sorting by Name");
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        Comparator<Student> cm2 = Comparator.comparing(Student::getAge);
        list.sort(cm2);
        System.out.println("Sorting by Age");
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        Comparator<Student> cm3 = Comparator.comparing(Student::getRollno);
        list.sort(cm3);
        System.out.println("Sorting by roll no.");
        for (Student st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
