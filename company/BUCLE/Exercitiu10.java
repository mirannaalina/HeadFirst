package com.company.BUCLE;
/*
cere 10 nr si scrie suma totala
 */

import javax.swing.*;

public class Exercitiu10 {
    public static void main (String[]args){
//variabile primitive carora le atribui valoarea 0
        int numar,elemente=0,suma=0;

//pentru elementele incepand de la 0 si ajung pana la 10 in bucla for
        for(elemente=0;elemente<10;elemente++){
//arata un ecran cu "Zi un nr"
            numar=Integer.parseInt(JOptionPane.showInputDialog("Zi un nr"));
//insumeaza toate numerele care le primesti
            suma+=numar;


        }
//cand iesi din bucla la al 10-lea element printeaza-mi suma numerelor
        System.out.println("Suma numerelor tale este: "+suma);







    }
}
