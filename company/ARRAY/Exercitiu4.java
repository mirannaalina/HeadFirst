package com.company.ARRAY;
//citeste 10 numere intregi , pastreaza-le intr-un array.
//trebuie sa aratam in urmatoare ordine: primu , ultimu , al doilea, penultimu,al 3lea.etc


import java.util.Scanner;

public class Exercitiu4 {
    public static void main (String[]args){
        Scanner intrare = new Scanner (System.in);

       // int primelenumere[],numeresfarsit[] ;

        //primelenumere = new int [5];
        //numeresfarsit =new int [5];

        int numere[] =new int[10];

int ultimu=numere[9];
int primu =numere[0];
        System.out.println("pastram elementele arrayului");
        for(int i=0;i<10;i++){
            System.out.println((i+1)+" zi un nr ");

           // primelenumere[i] = intrare.nextInt();
           // numeresfarsit[i] = intrare.nextInt();

            numere[i] =intrare.nextInt();


        }


        System.out.println("Afisam elementele arrayului primu ultimu al doilea ");

       // int j=0;
        for(int i=0;i<5;i++) {
            System.out.print(numere[i]+" "+numere[9-i]+ " ");
        }



    }
}
