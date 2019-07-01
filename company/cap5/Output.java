package com.company.cap5;

public class Output {
    public static void main (String[]args){

       //a creat un obiect
        Output o =new Output();
        //variabila de referinta
        //a invocat metoda
        o.go();

        System.out.println(" hi ");
        System.out.println(" world ");
    }
    //metoda go

    void go(){
        int y =7;
        for (int x=1;x<8;x++){ //y=7 ,x=7
            y++;

            if (x>4) {
                System.out.print(++y +" " );

            }

            if (y>14){
                System.out.print("x = " + x + " " );
                break;

            }

        }
    }
}
