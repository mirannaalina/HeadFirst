package com.company.BUCLE;

import javax.swing.*;
/*

Citeste un nr si indica daca e pozitiv sau negativ.Procesul se repeta pana se intr un 0.
 */

public class Exercitiu2 {
    public static void main (String[]args) {

        int numar;

        numar = Integer.parseInt(JOptionPane.showInputDialog("Scrie un nr:"));

        while (numar >= 0) {

            JOptionPane.showMessageDialog(null, "nr" + numar + " e pozitiv");

            numar = Integer.parseInt(JOptionPane.showInputDialog("Scrie alt nr:"));

        }

        while (numar<0) {
            JOptionPane.showMessageDialog(null, "nr" + numar + " e negativ");

            numar = Integer.parseInt(JOptionPane.showInputDialog("Scrie alt nr:"));

        }


            while (numar == 0) {
                break;
             }


    }

}
