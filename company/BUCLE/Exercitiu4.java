package com.company.BUCLE;

import javax.swing.*;
/*
Cere nr pana se tasteaza unul negativ si arata cate nr s-au introdus
 */

public class Exercitiu4 {
    public static void main (String[]args){

        int numar,contor=0;
        do {//da-mi un nr
        numar =Integer.parseInt(JOptionPane.showInputDialog("da-mi un nr"));

            contor++;

        } while (numar>=0) ;{//atata timp cat numaru e mai mare ca 0


            System.out.println("ai introdus " +contor+" numere");

        }
    }
}
