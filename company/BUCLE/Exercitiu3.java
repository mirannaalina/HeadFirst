package com.company.BUCLE;

import javax.swing.*;
/*
Citeste numere pana se introduce un 0.Pentru fiecare indica daca e par sau impar.
 */
public class Exercitiu3 {
    public static void main (String[]args){

        int numar;

        numar =Integer.parseInt(JOptionPane.showInputDialog("zi un nr:"));

        while (numar !=0) {//atata timp cat e diferit de 0

            if (numar % 2 == 0) {//daca nr e par {

                System.out.println("nr e par");//afiseaza asta
            } else { //daca nu e par
                System.out.println("nr e impar");//afiseaza asta

            }

            numar =Integer.parseInt(JOptionPane.showInputDialog("zi alt nr:"));

        }

    }
}
