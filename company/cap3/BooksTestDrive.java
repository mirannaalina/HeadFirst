package com.company.cap3;

public class BooksTestDrive {

    public static void main (String[]args){

//ca sa pot crea un OBIECT trebuie sa am o CLASA NUMITA DUPA ACEL OBIECT!!
        //in cazu de mai jos am Books dupa care am definit o clasa Books in alta parte.


        //am creeat o biblioteca(array) ce va putea tine 3 carti
        Books [] myBooks = new Books [3]; //mybooks variabila de referinta ,new creeaza obiectu ,=leaga variabila de ref de obiect
        int x=0;
        //am creat cartiile NU UITA INTR_UN ARRAY SA CREEZI OBIECTUL DUPA !!!!!!!!!!!
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        //variabilele de referinta sunt mai jos  , le spunem din remote control ce atributii are obiectul ,
        //cum avem mai jos titlu ,autor...

        myBooks[0].title = "The Grapes of Java ";
        myBooks[1].title = "the Java Gatsby";
        myBooks[2].title =  "the Java Cookbook";

        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";


        //am x care e 0 , lungimea array-ului este de 3 , length mi le numara si imi afiseaza
        //numele fiecarei carti si mai jos autorul intr-o bucla while.
        while (x < myBooks.length) {
            System.out.println(myBooks[x].title);
            System.out.print("by:");
            System.out.println(myBooks[x].author);
            x=x+1;



        }

    }

}
