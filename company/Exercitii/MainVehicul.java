package com.company.Exercitii;

import java.util.Scanner;

public class MainVehicul {

    public static int indiceMasinaCeaMaiIeftina(Vehicul masini[]){
        float pret;
        int indice=0;

        pret=masini[0].getPret();
        for(int i=1;i<masini.length;i++){
            if(masini[i].getPret()<pret){
                pret=masini[i].getPret();
                indice=i;
            }
        }
        return indice;
    }


    public static void main(String[] args) {
        Scanner intrare = new Scanner(System.in);

        String marca,model;
        float pret;
        int numarVehicul,indiceMasinaIeftina;

        int numarVehicule;
        System.out.println("Zi cantitate de vehicule");
        numarVehicule = intrare.nextInt();

        //cream obiectele pt masini
        Vehicul masini[] =new Vehicul[numarVehicule];

        for(int i=0;i<masini.length;i++){
            intrare.nextLine();
            System.out.println("Zi caracteristicile masinii"+(i+1)+":");
            marca = intrare.nextLine();
            System.out.println("introdu modelul:");
            model= intrare.nextLine();
            System.out.println("introdu pretul:");
            pret= intrare.nextFloat();

            masini[i] = new Vehicul(marca,model,pret);
        }

        indiceMasinaIeftina =indiceMasinaCeaMaiIeftina(masini);

        System.out.println("\n Masina cea mai ieftina este: ");
        System.out.println(masini[indiceMasinaIeftina].arataDate());
    }
}
