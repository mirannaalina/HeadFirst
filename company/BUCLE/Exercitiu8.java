package com.company.BUCLE;

import javax.swing.*;
import java.util.Scanner;

/*
Cere un nr N si arata toate nr de la 1 la acel N
 */
public class Exercitiu8 {
    public static void main (String[]args){

        Scanner intrare = new Scanner(System.in); //sa dai de la tastatura in interiorul programului
        int i=1,numaratoare;//variabila


        System.out.print("Zi un nr: ");//ce sa printeze

        numaratoare=intrare.nextInt();//numaratoarea combinata cu nr de la tastatura

        while (i<=numaratoare){//i <= ce pun eu de la tastatura
            System.out.println(i);//mi-l afiseaza pe i
            i++;
        }

    }
}
