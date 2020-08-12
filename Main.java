package com.company;

import java.util.ArrayList;
import java.util.Collections;

// rename this class to Employee
class Sorting implements Comparable<Sorting> {
    private final double idcard;
    private final String employee;
    private final int age;

    // add @Override
    public int compareTo(Sorting m) {
        return this.age - m.age;
    }


    public Sorting(String emp, double id, int age) {
        this.employee = emp;
        this.idcard = id;
        this.age = age;
    }


    public double getIdCard() {
        return idcard;
    }

    public String getEmployee() {
        return employee;
    }

    public int getAge() {
        return age;
    }
    // you could have overridden toString
}


class Main {
    public static void main(String[] args) {
        // the reference should be of super-type - so replace in LHS ArrayList to List
        ArrayList<Sorting> list = new ArrayList<>();
        list.add(new Sorting("employee1", 1 , 20));
        list.add(new Sorting("employee2", 10, 27));
        list.add(new Sorting("employee1", 21, 23));
        list.add(new Sorting("employee4", 3 , 23));

        Collections.sort(list);

        System.out.println("employees details after Sorting : ");
        // use toString instead of manually printing
        // also you can use streams to print/loop over the list
        for (Sorting sorting : list) {
            System.out.println(sorting.getEmployee() + " " +
                    sorting.getIdCard() + " " +
                    sorting.getAge());
        }
    }

}
