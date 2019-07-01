package com.company.ESTATIC;

//membrii statici apartin clasei nu obiectelor
//nu au nevoie de obiecte , nu au nevoie de nimeni de ex clasa math, nu are nevoie de o instanta

public class Estatic {

    private static String fraza= "Prima fraza";//chiar daca schimb valoarea mai jos

    public static int suma (int nr1, int nr2){
        int suma =  nr1+nr2;
        return suma;
    }


    public static void main(String[] args) {

        Estatic ob1 = new Estatic();
        Estatic ob2 = new Estatic();

        ob2.fraza = " A doua fraza";//ramane tot prima fraza

        System.out.println(ob1.fraza);
        System.out.println(ob2.fraza);

        System.out.println(Estatic.fraza);//daca pui asta de fiecare data apare a doua fraza
        System.out.println("suma este"+Estatic.suma(3,4));

    }
}
