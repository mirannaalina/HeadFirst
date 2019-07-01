package com.company.BUCLE;
/*
Cere un nr(ce trebe sa fie intre 0 si 10 ) si arata tabelul de multiplicare a nr spus
 */

import javax.swing.*;

public class Exercitiu16 {
    public static void main (String[]args){
        int numar=0,multiplicare=0;

        numar=Integer.parseInt(JOptionPane.showInputDialog("Zi-mi un nr intre 0 si 10"));


        if (numar>10){
            System.out.println("numarul trebuie sa fie mai mic ");

            numar=Integer.parseInt(JOptionPane.showInputDialog("Zi-mi alt nr"));

        }
        if(numar<0){
            System.out.println("numarul trebuie sa fie mai mare ");


            numar=Integer.parseInt(JOptionPane.showInputDialog("Zi-mi alt nr"));
        }

        for(int numere=1;numere<=10;numere++){//am zis numerele de la 1la 10
           multiplicare = numar * numere;   //variabila multiplicare e inmultirea numerelor de la 1 la 10

            System.out.println(+numar+ " X " +numere +" = " +multiplicare);

        }





    }
}
