package com.company.BUCLE;

import javax.swing.*;

/*
cere 5 calificative de elevi si decide la final daca vreunu e suspendat >4
 */
public class Exercitiu22 {
    public static void main(String[]args){
        int calificativ;
        boolean suspendat=false;

        for(int i=1;i<5;i++) {

            calificativ = Integer.parseInt(JOptionPane.showInputDialog("zi calificativ :"));

            if(calificativ<=4){
                suspendat =true;
            }
        }

        if (suspendat==true){
            System.out.println("exista unul sau mai multi elevi suspendati");
        }else {
            System.out.println("nu avem elevi suspendati ");
        }
    }
}
