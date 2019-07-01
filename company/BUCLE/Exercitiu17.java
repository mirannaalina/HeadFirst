package com.company.BUCLE;
/*
O firma ce vinde dezinfectant are nevoie de un prg pt a gestiona facturile.In fiecare
factura trebuie sa fie :codul articolului ,cantitatea vanduta in litrii si pretul pe litru.
Se cer 5 facturi introduse: FActura ttotala , cantiatea in litrii vanduta a articolului 1 si
cate facturi se emit mai mult de $600
 */

import javax.swing.*;

public class Exercitiu17 {
    public static void main (String[]args){
        int cod,litrii,litriiArticol1=0,facturiMari600=0,pretLitru2=3;
                float pretLitru,importFactura,facturaTotala=0,pretLitru1=0.6F;
                float pretLitru3=1.25F;

              pretLitru=pretLitru1+pretLitru2+pretLitru3;

                for(int i=1;i<=5;i++) {
                    cod = Integer.parseInt(JOptionPane.showInputDialog("zi codul articolului :"));
                    litrii = Integer.parseInt(JOptionPane.showInputDialog("zi cati litri are : "));

                    importFactura = (float) litrii * pretLitru;  // asa se calculeaza o factura totala
                    //apoi facem suma iterativa a tuturor facturilor
                    facturaTotala += importFactura;


                    if (cod == 1) {
                       litriiArticol1+= litrii;

                    }
                    if(importFactura>600){
                        facturiMari600++;
                    }


                }

                System.out.println("rezumat de vaznari");
        System.out.println("facturi totale " +facturaTotala);
        System.out.println("cantitatea de litrii articol 1" +litriiArticol1);
        System.out.println("facturi mai mari de 600" +facturiMari600);





    }
}
