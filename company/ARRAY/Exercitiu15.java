package com.company.ARRAY;
//citeste 10 nr intregi ordonate crescator .Citeste N si cauta-l in tabela
//trebuie sa se arate pozitia in care se gaseste nr N
//Daca nu este indica asta cu un mesaj

import java.util.Scanner;

public class Exercitiu15 {
    public static void main (String[]args){
        Scanner intrare =new Scanner(System.in);
        int arreglo[],numar;
        boolean crescator =true;

        arreglo =new int[10];//cream arrayu cu 10 pozitii

        do{
            //cerem arrayu
            System.out.println("Zi arrayul: ");
            for(int i=0;i<10;i++){
                System.out.print((i+1)+"zi un nr ");
                arreglo[i] = intrare.nextInt();
            }
            //verificamdaca arrayu e ordonat

            for (int i=0;i<9;i++){//daca puneam 10 , iesea din array cu i+1

                if(arreglo[i] < arreglo[i+1]){//crescator 1-2-3-
                    crescator=true;
                }
                if(arreglo[i] > arreglo[i+1]){//descrescator-3-2-1
                    crescator=false;
                    break;//iese din bucla for
                }
            }
            if(crescator ==false){
                System.out.println("arrayul e dezordonat , zi-l mai odata\n");
            }
        }while(crescator ==false);

        //cerem numarul N ce trebuie sa-l cautam in array
        System.out.println("zi numarul de cautat in array");

        numar =intrare.nextInt();

        //cautam nr in array
        int i=0;
        //4
        //1-2-3-4-5-...-10
        while(i<10 && arreglo [i] <numar){
            i++;
        }
        if(i==10){//am cautat in tot arrayu si n am gasit numarul
            System.out.println("nr nu s-a gasit");

        }else {
            if(arreglo[i]==numar){
                System.out.println("\n numaru gasit in pozitia" +i);

            }else{
                System.out.println("\n numarul nu a fost gasit ");
            }
        }
    }
}
