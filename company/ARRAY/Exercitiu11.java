package com.company.ARRAY;
//citeste 5 elemente numerice ce se introduc ordonat de forma crescatoare
//le pastram intr-o tabela de dimensiune 10.
//citeste un nr N , si insereaza-l in locul indicat pentu ca tabela sa continue ordonat


import java.util.Scanner;

public class Exercitiu11 {
    public static void main (String[]args){
             Scanner intrare =new Scanner(System.in);
             int arreglo[] =new int[10];
             boolean crescator =true;
             int numar,locul_numarului=0,j=0;

        System.out.println("umple arrayul");

        do{//umplem arrayul
            for(int i=0;i<5;i++){
                System.out.println((i+1)+"zi un nr");
                arreglo[i]=intrare.nextInt();
            }
            //aratam daca arrayul este ordonat crescator
            for(int i=0;i<4;i++) {
                if (arreglo[i]<arreglo[i+1]) {//crescator 1-2-3
                    crescator=true;
                }
                if (arreglo[1]>arreglo[i+1]) {//descrecator 3-2-1
                    crescator=false;
                  break;
                }
            }

            if(crescator==false){
                System.out.println("\n arraiu nu e in forma crescatoare");
            }
        }while(crescator==false);


        System.out.println("\n zi un element de adaugat: ");
        numar=intrare.nextInt();

        //asa ne dam seama in ce pozitie merge nr
        while(arreglo[j]<numar && j<5){
            locul_numarului++;
            j++;
        }
        //pentru ultimu , mutam o pozitie in array a elementelor ce vin in spatele
        for(int i=4;i>=locul_numarului;i--){
            arreglo[i+1]=arreglo[1];
        }
        //inseram numarul ce utilizatorul l a pus
        arreglo[locul_numarului]=numar;

        System.out.print("\n arrayul ramane:  ");
        for(int i=0;i<6;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
    }
}
