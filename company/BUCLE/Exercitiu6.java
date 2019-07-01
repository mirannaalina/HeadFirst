package com.company.BUCLE;
/*
cere numere pana tastezi 0 si arata suma tuturor numerelor introduse.
 */

import javax.swing.*;

public class Exercitiu6 {
    public static void main (String[]args){
        int numar,elemente=0,suma=0;//legam variabilele numar cu elementele lui si cu 0
        //le-am initializat cu 0

        do {//fa-mi conditia asta de a da un nr de la tastatura
            numar = Integer.parseInt(JOptionPane.showInputDialog("Da un nr "));


            suma+=numar;//insumeaza suma numerelor pe care le dai
            elemente++;//si trece la elementul urmator,elementul fiind legat de numar

        }while(numar!=0);//fa asta pana numaru de la tastatura nu e egal cu 0
        //cand e egal mori si afiseaza-mi ce e mai jos :

        System.out.println("Ai ajuns la final si suma numerelor introduse este "+suma);
    }
}
