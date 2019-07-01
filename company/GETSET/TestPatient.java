package com.company.GETSET;

public class TestPatient {

    public static void main(String[] args) {
        Patient p1 =  new Patient();

        p1.setName("bob");

        Patient p2 = new Patient();

        p2.setName("Jill");

        System.out.println(p2.getName());

    }
}
