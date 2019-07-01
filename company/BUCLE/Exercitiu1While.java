package com.company.BUCLE;

import java.util.Scanner;

public class Exercitiu1While {
    /*
    While (Conditie) {

    Instructiuni;

    }
daca conditia nu e adevarata nici nu intra in bucla
     */

    public static void main (String[]args){


        Scanner entrada = new Scanner(System.in);
        int i=1,contador;

        System.out.print("zi un nr ");
        contador =entrada.nextInt();


        while (i<=contador){
            System.out.println(i);
            i++;
        }
    }


}
