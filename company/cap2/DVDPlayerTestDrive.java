package com.company.cap2; //fac parte din acelasi pachet

public class DVDPlayerTestDrive {
    //am creat clasa main

    public static void main (String[]args) {


        DVDPlayer d=new DVDPlayer (); //am creat un nou obiect numit d

        //invocam metodele create in clasa anterioara dvdplayer

        d.canRecord =true; //variabile de referinta
        d.playDVD(); //nu avem niciun argument
        if (d.canRecord == false){
            d.recordDVD();
        }
    }

}
