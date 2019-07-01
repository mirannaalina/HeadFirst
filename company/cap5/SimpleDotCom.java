package com.company.cap5;

import java.util.ArrayList;

public class SimpleDotCom {

    //atributii

    //am delcarat un array ca sa tina locul celulelor.
     int[] locationCells ;


    //am creat un int ca sa tina numarul de incercari.
    int numOfHits = 0;


    //metode

    public void setLocationCells (int[] locs) { //metoda de setat locatia celulelor



        locationCells =locs;


    }

    public String checkYourself(String stringGuess) { //metoda de verificat daca am atins vreo celula
        //castigatoare


        int guess = Integer.parseInt(stringGuess); //transforma un integer in string

        String result = "miss";

        for (int cell : locationCells) {

            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
// daca numarul de lovituri egal cu lungimea array-ului
        if (numOfHits == locationCells.length) { //length numara fiecare casa din array
            result = "kill";

        }

        System.out.println(result);
        return result;



     }

}