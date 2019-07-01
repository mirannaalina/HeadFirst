package com.company.Incapsulare;

public class CaineBun {

    //declaram variabila PRIVATA
    private int marime;

    public int getMarime(){//set si get se declara ca publice
        return marime;
    }
    public void setMarime(int s){ //notam argumentul intreg s care e variabila  in corpul metodei
        marime =s;
    }

    public void latra(){
        if (marime >60){
            System.out.println("hau hau");
        }else if (marime>14){
            System.out.println("babu bau");
        }else{
            System.out.println("ham ham");
        }
    }

}
