package com.company.Incapsulare;

public class Puzzle {
    public static void main (String[]args){
        puzzle4b [] obs = new puzzle4b[6];
        int y =1;
        int x =0;
        int rezultat =0 ;
        while(x<6) {
            obs[x] = new puzzle4b();
            obs[x].ivar=y;

            y = y * 10;
            x=x+1;
        }
        x=6;

        while(x>0){
            x=x-1;
            rezultat=rezultat+obs[x].faceCeva(x);

        }
        System.out.println("rezultat "+rezultat);


    }
}
