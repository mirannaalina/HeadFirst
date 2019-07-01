package com.company.ARRAY;

//citeste 5 numere  pastreaza-le intr-un array si afiseaza-le in ordine inversa introdusa

import java.util.Scanner;

public class Exercitiu2 {
    public static void main (String[]args){

        Scanner intrare = new Scanner (System.in);

        float [] numar = new float[5];

        System.out.println("pastreaza datele arrayuli ");
        for(int i=0;i<5;i++){
            System.out.print((i+1) +".  zi un nr: ");
            numar[i] = intrare.nextFloat();
        }
        System.out.println("\n imprima elementele arrayului in ordine inversa");
        for(int i=5;i>0;i--){
            System.out.println(i);
        }



    }
}
