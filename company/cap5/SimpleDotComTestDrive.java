package com.company.cap5;

public class SimpleDotComTestDrive {
    public static void main (String[]args){


        SimpleDotCom dot = new SimpleDotCom() ; //am creat obiectul

        int[] locations = {2,3,4}; //am creat un array int pentru locatiile
        //consecutive posibile din 7

        dot.setLocationCells(locations);//am invocat metoda setter din clasa cealalta

        String userGuess = "2"; //cream un user care alege un nr

        String result = dot.checkYourself(userGuess);//invocam checkyourself metoda din obiect si
        //trece prin userul nostru fals

        String testResult ="failed";

         if (result.equals("hit")) {

             testResult = "passed";//daca userul fals (2) da un hit ,trece

        }
            System.out.println(testResult);//printeaza rezultatul daca a trecut sau nu


    }
}
