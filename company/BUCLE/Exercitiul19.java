package com.company.BUCLE;
/*
dati 6 note scriind cantiatea de copii aprobati ,conditionati (=4) si respinsi
 */

import javax.swing.*;

public class Exercitiul19 {
    public static void main (String[]args) {
        float nota;
        int aprobati = 0, conditionati = 0, respinsi = 0;

        for (int i = 1; i <= 6; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("da o nota de la 0 la 10"));

            } while (nota < 0 || nota > 10); //nota e la 0 la 10

            if (nota == 4) {
                conditionati++;
            }
            else if (nota>=5){
                aprobati++;
            }
            else {
                respinsi++;
            }

        }

        System.out.println("aprobati :" +aprobati);
        System.out.println("conditionati :" +conditionati);
        System.out.println("respinsi : " +respinsi);

    }
}
