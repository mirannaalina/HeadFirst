package com.company.Teste;

public class Bradut {
    public static void main(String[] args) {

        int h = 4;
        int h2 = h;


        for (int k = 0; k <= 2; k++) {
      h2=h;
            for (int x = 0; x < h; x++) {
                h2--;


                for (int y = 0; y <= h2; y++) {
                    System.out.print(" ");
                }

                for (int y = 0; y <= 2 * x; y++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }


    }
}

