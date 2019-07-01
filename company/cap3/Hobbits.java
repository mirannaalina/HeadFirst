package com.company.cap3;

public class Hobbits {
    //atributii
    //variabile primitive

    String name;

    public static void main (String[]args) {

        //am creat casa de hobbiti(array)
        Hobbits [] h = new Hobbits [3];

        int z = -1 ;
        while (z < 2);{
            z = z + 1 ;
            //z va fi pe rand 0 ,1 ,2
            //am facut o bucla while pana cand ajunge la 2 , adica la ultimul nume de hobit

            //acum creeam hobiti
            h[z] = new Hobbits();
            //am creat variabilele de referinta (remote control)

            h[z] .name = "bilbo";
            if (z==1){
                h[z].name ="frodo";
            }
            if (z==2){
                h[z].name="sam";
            }

            System.out.print(h[z].name +"is a ");
            System.out.println("good Hobbit name");



        }


    }

}
