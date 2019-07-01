package com.company.Incapsulare;

public class Animale {
    int contor =6 ;

public static void main (String[]args) {
   int numar =0;
   Animale[] m4a = new Animale[20];
   int x=0;

   while (x<7) {
       m4a[x] = new Animale();
       m4a[x].contor = m4a[x].contor + 1;
       numar = numar + 1;
       numar = numar + m4a[x].poateNou(x);
       x = x + 1;
   }
    System.out.println(numar+" "+m4a[1].contor);
   }
   public int poateNou(int index){
    if(index<7){
        Animale m4 =new Animale();
        m4.contor=m4.contor+1;

    }
    return 0;
   }

}
