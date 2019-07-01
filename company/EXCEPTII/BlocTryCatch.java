package com.company.EXCEPTII;

import javax.swing.*;
import java.io.*;

public class BlocTryCatch {
    //pt exceptii verificate -- IOException

    public void CitesteFisierul() throws FileNotFoundException, IOException {

        File fisier = new File("/Users/mirannaalina/IdeaProjects/HeadFirst/practice/src/com/company/EXCEPTII/text.txt");
        //ia fisierul ce i l-am dat
        FileReader fr = new FileReader(fisier);
        //citeste fisierul
        BufferedReader bf = new BufferedReader(fr);
        //ia toate informatiile din el dupa ce il citeste ( ca un cos plin de cumparaturi

        String linie;

        while ((linie = bf.readLine()) != null) {//asociaza variabila string linie cu ce e in cosul cu text
            System.out.println(linie);//si atat timp cat fisieru nu e gol , afiseaza ce e in cos
        }


    }
    public void CitesteFisierul2(){
        try{
            CitesteFisierul();//incearca sa faci tot ce e in metoda asta
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"nu s-a gasit nici-un fisier :(");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"avem o exceptie verificata");
        }finally{
            System.out.println("finally se executa intotdeauna , chiar daca e o exceptie sau nu");
        }

        System.out.println("programul s-a terminat");
    }

    public static void main(String[] args) {
        BlocTryCatch verificare = new BlocTryCatch();//am instantiat clasa noastra

        verificare.CitesteFisierul2();

    }
}
