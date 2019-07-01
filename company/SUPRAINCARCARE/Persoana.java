package com.company.SUPRAINCARCARE;
//-----------------------------OVERLOADING
public class Persoana {

    //variabile de instanta
    String nume;
    int varsta;
    String dni;

    //metode constructor OVERLOADED -SUPRAINCARCATE

    public Persoana (String nume, int _varsta){//primu constructor are 2 parametrii String si INT
        this.nume = nume;
        varsta = _varsta;
    }

    public Persoana(String dni){ // al doilea constructor are 1 singur parametru String
        this.dni = dni;

    }

    //metode normale OVERLOADED-SUPRAINCARCATE
    public void  fugi(){//deci ai voie sa pui mai multe metode cu acelasi nume , dar trb sa fie parametrii diferiti
        System.out.println("sunt "+nume+",am "+varsta+ " ani si fug la maraton");
    }
    public void fugi(int km){//asta are parametru km si nu se plange ca sunt 2 metode identice
        System.out.println("am fugit "+km+" kilometrii");

    }
    /*public int fugi(int km){  // nu conteaza daca am pus int , tot da eroare daca sunt la fel parametrii
    //chiar daca returneaza ceva
        return 0;
    }
*/
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Alina",21);//am folosit primu constructor , cel cu 2 parametrii

        persoana1.fugi();//am folosit prima metoda ,cea fara niciun parametru

        Persoana persoana2 = new Persoana("1234");//am folosit al 2lea constructor , cu 1 parametruu

        persoana2.fugi(10);//am folosit a 2a metoda , cea cu 1 parametru
    }
}
