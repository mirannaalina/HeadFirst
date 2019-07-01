package com.company.Incapsulare;

public class puzzle4b {
    int ivar;

    public int faceCeva(int factor) {
        if (ivar > 100) {
            return ivar *factor;
        } else {
            return ivar*(5-factor);
        }

    }
}
