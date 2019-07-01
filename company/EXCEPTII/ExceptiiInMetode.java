package com.company.EXCEPTII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptiiInMetode {


    public void CitesteFisierul()throws FileNotFoundException{ //superclasa IOException-- nu merge

        //--- poti sa  pui o subclasa prima , nu poti pune IOException sau Exception pt ca subclasa FilenotFoundEX n-ar mai prinde nimic
        File fisier = new File("/Users/mirannaalina/IdeaProjects/HeadFirst/practice/src/com/company/EXCEPTII/text.txt");
        FileReader fr = new FileReader(fisier);//daca nu avem Throws si exceptia , nu ne lasa sa compilam (ne obliga)
        //eroare : unreported exception

        //declaram doar exceptia prin Throws
    }

    public void CitesteFisierul2()throws IOException { //subclasa FileNotFoundException--invers
        CitesteFisierul();
    }
}
