package com.company.BUCLE;

/*
Cere 10 nr .arata media numerelor pozitive ,media nr negative si cantitatea de 0
 */

import javax.swing.*;

public class Exercitiu13 {
    public static void main (String[]args){
        int numar,suma_pos=0,cantitatea_pos=0,suma_neg=0,cantitatea_neg=0,cantitaea_zero=0;
        float media_pos,media_neg;

        for(int i=1;i<=10;i++){//iti cere de 10 ori un nr
            numar= Integer.parseInt(JOptionPane.showInputDialog("zi un nr"));
//conditionale
            if(numar==0){//daca nr ales este egal cu  0
                cantitaea_zero++;//incrementeaza cantitatea de 0-uri

            }else if (numar>0){//sau daca numarul este mai mare decat 0,adica un nr pozitiv
                suma_pos+=numar;//insumeaza numerele
                cantitatea_pos++;//si incrementeaza cantitatea de numere pozitive
            }else {//altfe , dar nr e un nr negativ
                suma_neg+=numar;//insumeaza numerele negative
                cantitatea_neg++;//si incrementeaza cantitatea de numere negative
            }
        }

        if (cantitatea_pos==0){//daca nu am nr pozitive, n-ai cum sa faci media aritmetica
            System.out.println("nu se poate face media");//deci afiseaza asta
        }else {//altfel
            media_pos=(float) suma_pos/cantitatea_pos ;//media este egala cu suma numereler pozitive impartit la cate sunt
            System.out.println("MEdia numerelor pozitive este" + media_pos);//afiseaza media lor
        }

        if(cantitatea_neg==0){//daca nu e niciun nr negativ , nu poti face media
            System.out.println("nu se poate face media");//deci afiseaza asta
        }else {//daca am nr negative
            media_neg=(float) suma_neg/cantitatea_neg;
            System.out.println("Media numerelor neative este "+ media_neg);

        }
        System.out.println("Cantitatea de 0 uri este de " +cantitaea_zero);
    }


}
