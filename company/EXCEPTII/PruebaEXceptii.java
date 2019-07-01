package com.company.EXCEPTII;

import java.util.Scanner;

public class PruebaEXceptii {

    public static void main(String[] args) {
        Scanner intrare = new Scanner(System.in);

        System.out.println("Zi un nr");

        int numar =intrare.nextInt();

        System.out.println(numar); //InputMismatchException exceptie cand tu dai un string in locul unui integer


    }
}
