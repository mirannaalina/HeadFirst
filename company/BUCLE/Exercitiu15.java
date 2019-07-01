package com.company.BUCLE;
/*
DAti varsta si inaltimea a 5 elevi , aratati media varstei si inaltimii ,cantiatea de elevi
cu varsta mai mare de 18 ani si cantitaea de elevi care au mai mult de 1,75
 */

import javax.swing.*;

public class Exercitiu15 {
    public static void main (String[]args){
        int varsta,sumaVarsta=0,varstaMaimare18=0,inaltimeMaimare170=0;
        float inaltime,sumaInaltime=0,mediaVarsta=0,mediaInaltime=0;

        for(int i=1;i<=5;i++){
            varsta=Integer.parseInt(JOptionPane.showInputDialog("Zi-mi varsta ta"));
            inaltime=Float.parseFloat(JOptionPane.showInputDialog("Zi-mi inaltimea ta"));

//suma iterativa a varstei si a inaltimii

            sumaVarsta+=varsta;
            sumaInaltime+=inaltime;

            if(varsta>18){//daca varsta e mai mare de 18 ,
                varstaMaimare18++;//incrementeaza
            }
            if(inaltime>1.75){
                inaltimeMaimare170++;
            }

mediaVarsta =(float) sumaVarsta/5;
            mediaInaltime=(float) sumaInaltime/5;

            System.out.println("varsta medie este de "+mediaVarsta);
            System.out.println("inaltimea medie este de "+mediaInaltime);
            System.out.println("cantitatea de elevi mai mari de 18  "+varstaMaimare18);
            System.out.println("cantitatea de elevi mai inalti de 170 "+inaltimeMaimare170);






        }

    }
}
