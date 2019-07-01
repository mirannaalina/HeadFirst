package com.company.SCANNER;

//intrari si iesiri de date prin CONSOLA

//avem nevoie de libraria scanner importata
import java.util.Scanner;

public class ScannerConsola {
    public static void main (String[]args){
        Scanner intrare = new Scanner/*instantiem obiectu scanner*/ (System.in);//sistem de intrare de date

        int numarinteger;
        float numarfloat;//!!!!!!!!!!!!!!!! cand cerem float in consola trebuie sa punem 15,3 , nu 15.3 ca da eroare
        double numardouble;
        String string;
        String string1;
        char litera;

        System.out.println("zi un nr: ");


        numarinteger = intrare.nextInt() ;//cu aceassta comanda pastram variabila integer ce utilizatoru ne-a zis-o
        numarfloat = intrare.nextFloat();
        numardouble = intrare.nextDouble();
        string = intrare.next();//next iti ia doar primu cuvant , daca intalneste un spatiu nu mai vede ce scrie dupa
        string1 = intrare.nextLine(); //Line iti ia tot sirul de caractere
        litera = intrare.next().charAt(0);//charAt(0) ia prima litera pe care a introdus-o utilizatoru daca cumva a introdus mai multe

        System.out.println("Numarul integer este :" +numarinteger);
        System.out.println("numarul float este" +numarfloat);
        System.out.println("Numarul double este"+numardouble);
        System.out.println("Cuvantul este "+string);
        System.out.println("Sirul de caractere este"+string1);
        System.out.println("Litera este : "+litera);


    }

}
