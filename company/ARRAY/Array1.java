package com.company.ARRAY;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Array1 {
    public static void main (String[]args){

        Scanner entrada =new Scanner(System.in); //intrare si iesire de date prin consola
        int Elementos; //variabila elemente

        Elementos = Integer.parseInt(JOptionPane.showInputDialog("zi cantitatea de elemente"));//intrare si iesire printr-o fereastra

        char [] letras = new char [Elementos]; // am creat un obiect(caracter) letras care are valori elementele din fereastra
        System.out.println("zi elementele arrayului : ");//afiseaza elementele array-ului din fereastra

        for (int i=0;i<Elementos;i++){ //bucla porneste de la 0 si ajunge la cate elemente am adaugat in fereastra
            System.out.println((i+1) + ". Zi un caracter : ");//i+1 arata elementele de la 1 in sus si textul
            letras[i] =entrada.next().charAt(0);//charAt arata doar prima litera daca cumva ai pus mai multe
        }

        System.out.println("\ncaracterele arrayului sunt : ");//afiseaza caracterele array-ului cu \n spatiu intre ele
        for(int i=0;i<Elementos;i++){//bucla porneste de la 0 si ajunge pana la cate elemente am adauga in fereastra
            System.out.println(letras[i] + " ");//afiseaza elementele
        }


    }

}
