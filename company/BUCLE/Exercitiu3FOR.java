package com.company.BUCLE;

import java.util.Scanner;

public class Exercitiu3FOR {
    /*

    for(Initializare;conditie;incrementare sau decrementare){
         instructiuni  }
FOR-se foloseste cand sti exact de cate ori se repeta
     */
    public static void main (String[]args){
        Scanner entrada =new Scanner (System.in);
        int contador;

        System.out.println("scrie nr: ");
        contador = entrada.nextInt();

        for(int i=2;i<=contador;i+=2){
            System.out.println(i);
        }
    }
}
