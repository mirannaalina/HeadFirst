package com.company.ARRAY;

//citeste datele corespondende a 2 tabele cu 12 elemente numerice
//baga-le ulterior intr-o tabela de forma
//3 din tabela A ,3 dinB ,3 din A , ,3 din B

import java.util.Scanner;

public class Exercitiu6 {
    public static void main (String[]args){

        Scanner intrare = new Scanner(System.in);
        int a[],b[],c[];

        a= new int [12];
        b=new int [12];
        c=new int [24];

        //printeaza si imi intra in bucla de 10 unde iar printeaza
        System.out.println("zi elementele primului array ");
        for(int i=0;i<12;i++){
            System.out.println((i+1)+"zi un nr");
            a[i]=intrare.nextInt();
        }
        System.out.println("zi elementele al 2lea array ");
        for(int i=0;i<12;i++){
            System.out.println((i+1)+"zi un nr");
            b[i]=intrare.nextInt();
        }

        int j=0;

        for (int i=0;i<12;i++){
            c[j]=a[i];
            j++;j++;j++;
            c[j]=b[i];
            j++;j++;j++;
        }
        System.out.println("\nal 3lea array este ");
        for(int i=0;i<24;i++){
            System.out.println(c[i]+" ");
        }
        System.out.println();




    }
}
