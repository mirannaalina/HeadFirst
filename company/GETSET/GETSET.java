package com.company.GETSET;

public class GETSET {
    //set se foloseste la incapsulare alaturi de variabila setata private

    //---------------------------------SET----------------------------------
    private double radius; //this.radius //nu o poti accesa din exterior

    public void setRadius(double radius){ //daca in parametru scriu tot radius si nu alt nume
        this.radius =radius; //cand ii zic la ce sa-mi seteze raza trebuie sa folosesc this. ca sa stie sa ia radius-ul anterior
        //adica cel privat
    }


    //--------------------------------GET------------------------------------
    public double getRadius(){
        return radius;
    }

}
