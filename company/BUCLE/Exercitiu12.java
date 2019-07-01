package com.company.BUCLE;
/*
cere un nr si calculeaza produsul factorial
 */

import javax.swing.*;

public class Exercitiu12 {
    public static void main(String[]args){

        int numar;
        long factorial=1;

        numar =Integer.parseInt(JOptionPane.showInputDialog("DA un nr" ));//primim un nr

        //cat timp numarul primit e mai mare sau egal cu 1
        while (numar>=1){
            //numar*=factorial;//inmulteste numarul de cate ori e nevoie
            factorial*=numar;
            numar--;//decrementeaza nr pana la 1
        }

        System.out.println("produsul factorial este "+factorial);//afiseaza inmutirea nr


    }
}
