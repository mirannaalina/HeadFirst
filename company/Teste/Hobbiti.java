package com.company.Teste;

public class Hobbiti {

    String name;
    public static void main (String[]args){

        Hobbiti [] h = new Hobbiti[3];
        int z = -1;

        while (z<2){

            z=z+1;
            h[z] = new Hobbiti();
            h[z].name ="bilbo";
            if(z==1){
                h[z].name="fredo";
            }
            if(z==2){
                h[z].name="sam";
            }

            System.out.println(h[z].name + " este un nume pt un hobbyt");

        }
    }
}
