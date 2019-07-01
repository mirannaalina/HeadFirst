package com.company.ARRAY;

import java.util.Scanner;

//citeste de la tastatura o serie de 10 nr intregi.
//aplicatia trebuie sa ne indice daca numerele sunt ordonate
//crescator,descrescator sau sunt dezordonate

public class Exercitiu7 {
    public static void main (String[]args){
        Scanner  intrare =new Scanner(System.in);//scanner


        int arreglo[] =new int [10];//cream array

        boolean crescator=false,descrescator=false;

        System.out.println("completati arrayul ");
        for(int i=0;i<10;i++){
            System.out.print("zi unnr : ");
            arreglo[i] =intrare.nextInt();
        }
        for (int i=0;i<9;i++){
            if(arreglo[i]<arreglo[i+1]){//array-u i mai mic decat arrayu i+1  1 mai mic ca 2
                crescator=true;
            }
            if(arreglo[i]>arreglo[i+1]){//array-ul i mai mare decat i+1  1 mai mare ca 2
                descrescator=true;
            }
        }
        //CONDITII

if(crescator==true && descrescator==false){ //daca nr sunt 0 1 2 3 4 5
    System.out.println("\narra-ul este crescator");
}else if (crescator==false && descrescator==true){//daca nr sunt 5 4 3 2 1 0
    System.out.println("\n array-l este descrescator");
}else if (crescator==true && descrescator==true){//daca nr sunt 1 4 2 5 6 4 6
    System.out.println("\n arrayul este dezordonat");
}else if(crescator==false && descrescator==false){//daca nr sunt 2 2 2 2 2 2 2
    System.out.println("\ntoate nr sunt egale");
}
    }
}
