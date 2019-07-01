package com.company.BUCLE;
/*
cere 10 nr si arata la final daca vreunu este negativ
 */

import javax.swing.*;

public class Exercitiu21 {
    public static void main (String[]args){
        int numar;
        boolean numarNegativ=false;

        for(int i=1 ;i<10;i++) {

            numar = Integer.parseInt(JOptionPane.showInputDialog("zi un nr"));

            if(numar<0){ //daca nr e negativ
                numarNegativ=true;

            }
        }
        if(numarNegativ ==true){
            System.out.println("exista cel putin un nr negativ");
        }else {
            System.out.println("nu exista nici un nr negativ");
        }

    }
}
