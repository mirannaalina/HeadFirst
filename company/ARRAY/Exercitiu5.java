package com.company.ARRAY;

import java.util.Scanner;

//citeste de la tastatura 2 tabele de 10 numere intregi
///si amesteca-le intr-una de forma 1A,1B,2A,2B
public class Exercitiu5 {
    public static void main (String[]args){
    Scanner intrare = new Scanner (System.in);
    int a[],b[],c[];

    a=new int [10];//array cu 10 elemente
    b=new int [10];//array cu 10 elemente
    c=new int [20];//array contine  a si b

        //cerem elementele arrayului 1

        System.out.println("zi elementele primului array: ");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+"zi un nr: ");
            a[i]=intrare.nextInt();
        }
        //cerem elementele arrayului 2

        System.out.println("\nzi elem arrayului al doilea: ");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+"zi un nr : ");
            b[i]=intrare.nextInt();//pastram intrarile in arrayul B
        }
        //acum bagam cele 2 arrayuri in c
        //folosim variabila i pt a si b
        //creeam o var j py arrayul c

        int j=0;
        for(int i=0;i<10;i++){
            c[j]=a[i]; //1a , 2a
            j++;
            c[j]=b[i];//1b , 2b
            j++;
        }
        System.out.println("\n al treilea array este: ");
        for(int i=0;i<20;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();



    }
}
