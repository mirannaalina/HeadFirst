package com.company.cap5;

/*
public class SimpleDotComGame2 {

    public static void main(String[] args) {

        //atributii(variabile)
        int numOfGuesses = 0;//am declarat o variabila ce tine numarul de ghicit
        GameHelper helper = new GameHelper();//avem o alta clasa gamehelper

        //am creat un obiect
        SimpleDotCom theDotCom = new SimpleDotCom();


        //facem un nr random de la pc
        int randomNum = (int) (Math.random() * 5);


        //declar un array integer cu 3 locatii
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};


        //invocam setlocation
        //prin obiectul creat thedotcom cu argumentul locations(array)

        theDotCom.setLocationCells(locations);//un fel de lipire a obiectului cu celulele si array-ul

        //declaram o variabila bool ,true ,isalive
        //care verifica in bucla while daca jocul e valabil
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);//intreaba dotcom sa verifice raspunsul
            //salveaza rezultatu returnat in string

                      numOfGuesses++;//incrementeaza numaratoarea jucatorului

            if (result.equals("kill")) {//daca rezultatul e kill ,

                isAlive = false;//nu mai e valabil jocul ,

                System.out.println("ai jucat de " + numOfGuesses + "ori");//deci printeaza numarul de ghicitori
            }

        }
    }
}
*/