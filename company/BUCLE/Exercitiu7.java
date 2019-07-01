package com.company.BUCLE;
/*
Cere numere pana ajungi la un nr negativ si apoi calculeaza media aritmetica

media aritmetica : e suma numerelor impartite la cate numere sunt
 */

import javax.swing.*;

public class Exercitiu7 {
    public static void main (String[]args){
        //variabile
        int numar,elemente=0,suma=0;//variabile sudate
        float media;//separat media numerelor

        //da un nr de la tastatura
        numar=Integer.parseInt(JOptionPane.showInputDialog("Da un nr "));

        while (numar>=0){//fa asta pana ajungi la un nr negativ
             suma+=numar; //suma iterativa
            elemente++;

            numar=Integer.parseInt(JOptionPane.showInputDialog("Da alt nr "));

        }
        //creeam conditii
        if(elemente==0) {//daca elementele sunt egale cu 0
           System.out.println("eroare,nu putem calcula 0");//printeaza eroare
        }else{//astfel ,
            media=(float) suma/elemente;//fa-mi media aritmetica suma impartiata la elemente
            System.out.println("Media este"+media);//si afiseaza media
        }


    }
}
