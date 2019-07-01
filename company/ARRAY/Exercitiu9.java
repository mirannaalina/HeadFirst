package com.company.ARRAY;

import java.util.Scanner;

//Creaza un program ce citeste de la tastatura o tabela de 10 numere intregi si se
//deplaseaza o pozitie in jos ,primu trece al 2lea ,al doilea trece al treilea
//ultimu devine primu
public class Exercitiu9 {
    public static void main (String[]args){
        Scanner intrare =new Scanner (System.in);//folosim scanner pt a scrie in consola

        int arreglo[] =new int[10];//cream un array cu 10 elemente
        int ultimu;//cream o variabila ce tine
        System.out.println("citeste arrayul");
        for (int i=0;i<10;i++){
            System.out.print(i+ "zi un nr : ");
            arreglo[i] =intrare.nextInt();
        }

        ultimu =arreglo[9];

        for(int i=8;i>=0;i--){
            arreglo[i+1]= arreglo[i];
        }
        arreglo[0] =ultimu;

        System.out.println("\nnoul array este : ");
        for(int i=0;i<10;i++){
            System.out.println(i+"numaru: " +arreglo[i]);
        }
    }
}
