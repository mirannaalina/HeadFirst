package com.company.Encaps;

public class encaps2 {
    public static void main(String[]args) {

        //in clasa main cream obiectul

        Encaps1 enc = new Encaps1();

        //invocam METODELE ACCESORII din clasa Encaps1 pt obiectul enc creat
        //dupa setam varsta obiectului

        enc.setEdad(21);
        //aratam varsta pe ecran
        System.out.println("varsta mea e : "+enc.getEdad() + " de ani");

        //setam numele obiectului
        enc.setNombre("Miranna");
        System.out.println("Numele meu este : "+enc.getNombre());

    }
}
