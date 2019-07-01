package com.company.cap4;

public class Puzzle4b {
    //atributii

    int ivar;

    //metode

    public int doStuff (int factor) { //parametrii

    if (ivar >100){
        return ivar * factor ;
    }
        else {
            return ivar * ( 5 - factor);
        }
    }


}
