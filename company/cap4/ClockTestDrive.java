package com.company.cap4;

public class ClockTestDrive {

    public static void main (String[]args){



        Clock c = new Clock();

        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("time: " +tod);
    }
}
