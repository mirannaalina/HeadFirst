package com.company.CONSTRUCTORI;
/*
cand se creza un obiect , se intampla 3 chestii :

- se asigneaza memorie pt obiectul creat
- se initializeaza atributiile obiectului
- se invoca constructorul clasei ce poate fi unu sau mai multi
 */

public class Persoana {

    String nume;
    int varsta;

    //metoda constructor
    public Persoana(String _nume , int _varsta){//are parametrii
        this.nume = _nume;//putem folosi si this. ca sa mi zica care e variabila de instanta
        this.varsta= _varsta; //ce nu are this e parametrul constructorului.
    }
    public void arataDatele(){
        System.out.println("numele este "+nume);
        System.out.println("varsta este "+varsta);
    }

//clasa Persoana are un constructor by default Persoana
    //dar noi putem crea alt constructor
    //putem crea chiar si mai multi constructori, cu diferenta sa aiba alte argumente
    //cand au mai multe argumente se numeste OVERLOADING - adica supra incarcarea metodei respective.

    public static void main(String[] args) {

        Persoana p1 =new Persoana("Alina",22);//ce e dupa new este constructorul clasei Persoana , care are acelasi nume si nu returneaza nimic
//cand instantiezi obiectul dupa clasa Persoana cere parametrii pt ca constructorul are parametrii

        p1.arataDatele();

    }

}
