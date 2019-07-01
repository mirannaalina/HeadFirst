package com.company.cap3;

public class TestArrays {

    public static void main(String[] args) {

        //am creat array
        //de forma intreg ,apoi numele , de length 4
        int[] index = new int[5];

        //variabile de referinta
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        index[4] =4;



        //al doilea array
        //de forma string ,apoi numele , apoi lungimea de 4
        String[] islands = new String[4];

        //variabile de referinta
        islands[0] = "bermuda";
        islands[1] = "fiji";
        islands[2] = "azores";
        islands[3] = "cozumel";


//dupa am creat variabila primitiva y care e egal cu 0,cand intru intr-un loop
        //am nevoie de o variabila de la care sa porneasca ,de ex 0 pt ca array incepe de la 0
        int y = 0;
        int ref;


        while (y < 4) {
            ref = index[y];

            System.out.print("island = ");
            System.out.println(islands[ref]);
            y=y+1;






        }





    }

}
