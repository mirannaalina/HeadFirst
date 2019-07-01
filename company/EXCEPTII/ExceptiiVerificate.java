package com.company.EXCEPTII;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptiiVerificate {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //JAVA TE OBLIGA SA LE VERIFICI

        //--------------------------------------Exceptii verificate (IOException)
        BufferedReader bf = new BufferedReader(//citim textul din fisierul FileReader :
                new FileReader("/Users/mirannaalina/IdeaProjects/HeadFirst/practice/src/com/company/EXCEPTII/text.txt")
        );
        // FileNotFoundException

        String linie;

        while ((linie = bf.readLine()) != null) {//asociaza variabila string linie cu ce e in fisierul text
            System.out.println(linie);//si atat timp cat fisieru nu e gol , afiseaza ce e in el
        }

    }
}