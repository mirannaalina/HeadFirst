package com.company.BUCLE;

import javax.swing.*;

/*
cere un nr N ,introdu salariile lui N si arata salariul maxim
 */
public class Exercitiu20 {
    public static void main (String[]args){
        int salarii,salariuMaxim=3000;

        for(int n=0;n<=5;n++) {

            salarii = Integer.parseInt(JOptionPane.showInputDialog(n + "zi salariul"));

            if(salarii> salariuMaxim){
                System.out.println("ai depasit salariul maxim de"+salariuMaxim);

            }
        }


    }

}
