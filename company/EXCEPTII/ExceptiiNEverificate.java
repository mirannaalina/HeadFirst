package com.company.EXCEPTII;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptiiNEverificate {

        //JAVA NU TE OBLIGA SA LE VERIFICI

    public static void main(String[] args) throws FileNotFoundException, IOException{

        int num1 =5, num2 =0, rezultat;

        rezultat=num1/num2;

        System.out.println(rezultat); //runtimeException

        //ArithmeticalException. - un nr nu poate fi impartit la 00000000000
        //e o greseala a mea , compilatoru nu ma obliga sa o schimb

    }
}
