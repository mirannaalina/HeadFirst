package com.company.ARRAY;

//bucle for each
public class Arrayforeach {
    public static void main (String[]args){

        String[] nume = {"Alexandre","Miranna","Medeea","brigite","Bogdan","hihh","hjjij"};

      /*  for(int i=0;i<nume.length;i++){//arata marimea arrayului fara ca sa zicem noi exac care e numaru de elemente
            System.out.println(nume[i]);
        }

        */
        for(String i:nume){
            System.out.println("numele sunt : " +i);
        }

    }
}
