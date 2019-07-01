package com.company.Incapsulare;

public class CaineBunTest {
    public static void main (String[]args){
        CaineBun unu =new CaineBun(); //instantiem obiectu cu numele unu (variabila de referinta)
        unu.setMarime(70);
        CaineBun doi = new CaineBun();
        doi.setMarime(8);
        System.out.println("caine unu "+unu.getMarime());
        System.out.println("caine doi "+doi.getMarime());
        unu.latra();
        doi.latra();
    }
}
