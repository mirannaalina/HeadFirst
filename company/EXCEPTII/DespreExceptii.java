package com.company.EXCEPTII;

public class DespreExceptii {
    //erori ce se pot ivi in program

    public static void main (String[]args) {

        int num1 = 5, num2 = 0;

        int rezultat = num1 / num2;//cand imparti un nr cu 0 , iese exceptia de mai jos

        System.out.println("rezultatul este" + rezultat); //iese o exceptie  ArithmeticException

        System.out.println("nu mai ajunge aici");//programu nu mai ajunge pana aici pt ca a intalnit exceptia aia si nu mai merge in jos
    }

}
