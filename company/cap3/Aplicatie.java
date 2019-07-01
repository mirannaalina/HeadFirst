package com.company.cap3;

public class Aplicatie {

    //String name; //variabila primitiva globala

    public static void main (String []args){


        //facem obiecte catei si ii accesam

        Dog catel1 = new Dog ();
        catel1.bark();
        catel1.name = "Bart";

        //facem un catel array

        Dog[] cateiiMei =new Dog[3]; //array-ul e cusca pt catei
        //am creat array-ul(cusca ) acum cream cateii pt ai pune in el

        cateiiMei[0] =new Dog ();
        cateiiMei [1]=new Dog ();
        cateiiMei [2] = catel1 ; //aici aveam deja un catel creat mai sus

        //acum accesam cateii folosind array-ul
        //variabile de referinta

        cateiiMei[0].name = "Fred";
        cateiiMei[1].name = "Marge";

        //deci am 3 catei :Fred,Marge si Bart +cusca

        System.out.println("last dog's name is " +(cateiiMei[2].name));

        //acum cream o bucla/loop prin array /cusca si le spun celor 3 catei ai mei sa latre

        int x = 0;
        while(x <cateiiMei.length) { //array-ul are o variabila lungime care imi da numarul de elemente din array,adica 3

            cateiiMei[x].bark();
            x=x +1;

        }


    }



}
