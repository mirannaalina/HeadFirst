package com.company.cap1;

public class BeerSong {
    public static void main (String[]args){
        int beerNum = 99;
        String word = "bottles";

//am renuntat la if else care era in plus
        while(beerNum > 0 ) {


            word = "bottle";


            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");

            beerNum = beerNum - 1;
        }
                System.out.println("No more bottles of beer on the wall");


    }
}
