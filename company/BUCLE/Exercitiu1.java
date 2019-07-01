package com.company.BUCLE;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;
/*

citeste un nr si arata radacina patrata ,repeta pana se introduce un nr negativ.
 */


public class Exercitiu1 {
    public static void main (String[]args){
        int numar ,radacinapatrata;

        numar=Integer.parseInt(JOptionPane.showInputDialog("Introduce un nr:"));

        while (numar>=0){
            radacinapatrata = (int) Math.pow(numar,2);


            JOptionPane.showMessageDialog(null,"radacina numarului" + numar+"este" +radacinapatrata);

            numar=Integer.parseInt(JOptionPane.showInputDialog("Introduce alt nr:"));

        }

    }
}
