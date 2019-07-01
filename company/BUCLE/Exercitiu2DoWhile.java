package com.company.BUCLE;

import java.util.Scanner;

public class Exercitiu2DoWhile {
    /*

    do {
        instructiuni ;
        }While (conditon);


   diferenta e ca prima data executa dupa se uita la conditie


    */
    public static void main (String[]args){

        Scanner entrada = new Scanner (System.in);//pot scrie informatii in program
        int i=1,contador; //initializam i=1 ,si variabila contador impreuna

        System.out.println("spune un nr: ");
        contador=entrada.nextInt();//ia variabila si o egaleaza cu numarul ce il dau eu

        do {
            System.out.println(i);//afiseaza i
            i+=3; //imi ia doar numerele din 3 in 3
        }

        while (i<=contador);//pana cand i e mai mic sau egal cu nr ce l am dat eu



    }
}
