package com.company.ARRAY;
//citeste 5 nr de la tastatura ,pastreaza-le intr-un array si realizeaza
//media numerelor pozitive , media numerelor negative si numara cate 0-uri ari

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {

        Scanner intrare = new Scanner(System.in);//afiseaza in consola

        float numere[] = new float[5];  //declar un array de 5 elemente
        float suma_pozitive = 0, suma_negative = 0, media_pozitive, media_negative;//variabilele de care am nevoie pt a crea suma
        int numara_pozitive = 0, numara_negative = 0, numara_zerouri = 0;//variabilele de care am nevoie pt a crea media

        System.out.println("pastram numerele in array");//afiseaza in consola
        for (int i = 0; i < 5; i++) {//parcurge toate 5 elemente ale array-ului
            System.out.println((i + 1) + "zi un nr : ");//afiseaza incepand de la 1 primul nr

            numere[i] = intrare.nextFloat();//toate 5 numerele le da utilizatoru din consola

            //CONDITII
            if (numere[i] == 0) {//daca nr dat de utilizator e 0
                numara_zerouri++;//atunci incrementeaza 0-urile care s-au adauga

            } else if (numere[i] > 0) {//daca numaru dat de utilizator e mai mare de 0
                suma_pozitive += numere[i];//suma = suma+numare
                numara_pozitive++;//incrementeaza nr pozitive
            } else {//altfel numerele sunt negative
                suma_negative += numere[i];//suma =suma+numere
                numara_negative++;//incrementeaza nr negative
            }

        }

        //media numerelor pozitive
        if (numara_pozitive == 0) {
            System.out.println("nu se poate face media nr pozitive");
        } else {
            media_pozitive = suma_pozitive / numara_pozitive;
            System.out.println("media pozitivelor este " + media_pozitive);
        }
        //media numerelor negative

        if (numara_negative == 0) {
            System.out.println("nu se poate face media nr negative");
        } else {
            media_negative = suma_negative / numara_negative;
            System.out.println("media negativelor este " + media_negative);
        }
        System.out.println("cantitatea de 0 este "+numara_zerouri);

    }
}
