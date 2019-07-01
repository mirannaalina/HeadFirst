package com.company.ARRAY;

//citeste 5 numere , pastrandu-le intr-un array si arata-le in aceiasi ordine introdusa

import java.util.Scanner;

public class Exercitiu1 {
    public static void main (String[]args){
        Scanner intrare =new Scanner(System.in);
        float[] numere=new float[5];

        System.out.println("pastreaza datele arrayuli ");
        for(int i=0;i<5;i++){
            System.out.print((i+1) +".  zi un nr: ");
            numere[i] = intrare.nextFloat();
        }
        System.out.println("\n imprima elementele arrayului");
        for(float i:numere){
            System.out.println(i);
        }


    }
}
