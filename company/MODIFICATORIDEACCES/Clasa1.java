package com.company.MODIFICATORIDEACCES;

public class Clasa1 {

    //------int atribut1; //pot accesa aceasta variabila doar din acelasi pachet asa  DEFAULT
    //daca vreau sa-l aduc intr-un pachet diferit , nu merge

       public int atribut1;   //asta il pot folosi si in afara pachetului actual


    //-----private int atribut1; //asta poate fi folosit doar in Clasa1 , nu conteaza ca clasa2 apartine aceluiasi pachet.!!

}
