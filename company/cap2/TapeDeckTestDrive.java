package com.company.cap2;

public class TapeDeckTestDrive { //am creat clasa main
    public static void main(String[] args) {

        //am creat un obiect numit t

        TapeDeck t = new TapeDeck();

        //invocam metodele din clasa tapedeck
        t.canRecord = false;//daca e false aici , nu mai ia if-ul care functioneaza doar daca e true
        t.playTape();    //variabile de referinta

        if (t.canRecord == true) {
            t.recordTape();

        }

    }
}
