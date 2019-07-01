package com.company.BUCLE;
/*
Cere 10 salarii . arata suma lor si  care sunt mai mari de $1000
 */

import javax.swing.*;

public class Exercitiu14 {
    public static void main (String[]args){
        long salarii,suma=0;

        for (int i=1;i<=10;i++) {
            salarii = Integer.parseInt(JOptionPane.showInputDialog("caat ai salariu :"));//te intreb de 10 ori ce salariu ai

            suma+=salarii; //insumeaza salariile intre ele
            //am conditia urmatoare
            if (salarii > 1000) {
                System.out.println("Suma este " + suma + "iar salariul tau este mai mare de 1000");
            } else {
                System.out.println("Suma este" + suma);
            }
        }

    }
}
