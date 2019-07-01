package com.company.ARRAY;
//citeste 10 nr intregi intr-o tabela
//pastreaza in alta tabela elementele pare din prima tabela
//si in continuare , elementele impare

import java.util.Scanner;

public class Exercitiu13 {
    public static void main (String[]args){
        Scanner intrare =new Scanner (System.in);
        int arreglo[] =new int [10];//arrayul pt cele 10 elemente intregi
        int numara_pare=0,numara_impare=0;

        //utilizatorul ne da 10 numere
        System.out.println("umplem arrayul:  ");
        for(int i=0;i<10;i++) {
            System.out.println((i + 1) + "Zi un nr: ");
            arreglo[i] = intrare.nextInt();

//in aceiasi bucla contabilizam cate nr pare si cate impare sunt
            if (arreglo[i] % 2 == 0){
                numara_pare++;

            }else{
                numara_impare++;
            }
        }
//apoi cream array-uri pt a le stoca
        int par[] =new int [numara_pare];//array pt nr pare
        int impar[] =new int [numara_impare];//array pt nr impare

//reutilizam variabilele si le initializam iara cu 0
        numara_pare=0;
        numara_impare=0;

        //inmagazinam nr pare in arrayu lor si imparele la fel

        for(int i=0;i<10;i++) {
            if (arreglo[i] % 2 == 0) {
                par[numara_pare] = arreglo[i];
                numara_pare++;
            } else {
                impar[numara_impare] = arreglo[i];
                numara_impare++;
            }
        }
 //apoi afisam arrayul cu nr pare si arrayu cu cele impare
        System.out.println("\n array pare");
        for(int i=0;i<numara_pare;i++){
            System.out.println(par[i]+" - ");
        } System.out.println("");

        System.out.println("\n array impare");
        for(int i=0;i<numara_impare;i++){
            System.out.println(impar[i]+"- ");
        } System.out.println("");
    }

}
