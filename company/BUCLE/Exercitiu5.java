package com.company.BUCLE;

import javax.swing.*;
import java.util.Random;
import java.util.jar.JarOutputStream;
/*
Realizeaza un joc pt a ghici un nr .Pentru asta ,genereaza un nr aleatoriu intre0 si 100
apoi cere nr indicand "e mai mare" sau "e mai mic" .PRocesul se termina cand utilizatoru
a ghicit nr si arata nr de incercari.
 */

public class Exercitiu5 {
    public static void main (String[]args){

        int numar, numarator=0,aleatoriu;

        aleatoriu = (int) (Math.random()*100);//genereaza un nr random pana la 100

        do { //afiseaza=mi un ecran unde sa pot adauga un numar
            numar = Integer.parseInt(JOptionPane.showInputDialog("zi un nr"));

            System.out.println("Numarul incercat anterior este"+numar);

             //creeaza conditie in interiorul LOOP-ului
             if (aleatoriu > numar) { //daca numaru ales aleatoriu e mai mare ca nr dat de mine

                 System.out.println(" Zi un nr mai mare");//afiseaza sa zic un nr mai mare
             } else {//daca nu , si nr aleatoriu e mai mic ca nr ales de mine
                System.out.println("Zi un nr mai mic");//mi se afiseaza sa zic un nr mai mic
             }
            numarator++;//numaratoarea initializata cu 0 creste in loop pana nu mai zic niciun nr
           }while (numar!=aleatoriu);//fa asta atata timp cat nu e egal cu aleatoriu,cand e egal mori
            //afiseaza ca am ghicit nr si nr de incercari pana sa ghicesc numarul.
            System.out.println("ai ghicit nr si ai incercat de "+numarator+" ori");


        }
    }

