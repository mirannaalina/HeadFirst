package com.company.ARRAY;

//proiecteaza o aplicatie ce declara o tabela de 10 elemente intregi.
//Citeste folosind tastatura 8 numere
//dupa trebuie sa ceri un nr si o pozitie ,inserandu-l in pozitia indicata
//schimbandu-i pe cele care sunt in urma

import java.util.Scanner;

public class Exercitiu8 {
    public static void main (String[]args){
        Scanner elemente = new Scanner(System.in);
        int arreglo[] =new int [10];
        int pozitie,nr;

        System.out.println("afisare array ");
        for (int i=0;i<8;i++){
            System.out.print(i+" zi un nr:");
            arreglo[i]= elemente.nextInt();

        }
        for (int j=0;j<10;j++){
            System.out.println(j+"zi o pozitie");

        }


    }
}
