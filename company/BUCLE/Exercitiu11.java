package com.company.BUCLE;
/*
Proiecteaza un program ce arata produsul celor 10 nr impare.
 */

public class Exercitiu11 {
    public static void main (String[]args){
        long produs =1;//nu punem 0 pt ca orice inmultire cu 0 e 0
        //avem nevoie de long pt ca inmultirea e mare

        for(int i=1;i<=20;i+=2){//pentru variabila creata i care incepe de la 1
            //ajunge pana la 19 (care semnifica cele 10 nr impare
            //i+=2 merge din 2 in 2 , deci avem 1 3 5 7 9 etc
            produs *=i;//asta face produsul dintre fiecare nr
        }
        System.out.println("PRodusul este :"+produs);//afiseaza produsul nr

    }

}
