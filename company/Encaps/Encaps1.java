package com.company.Encaps;



public class Encaps1 {

    //atributii encapsulate (adica private)
    private int edad;
    private String nombre;


    //METODE ACCESORII (setters si getters)

//metoda setter :stabileste varsta
    public void setEdad(int edad) {
        this.edad = edad;
    }
//si metoda getter arata varsta
    public int getEdad() {
        return edad;
    }
//metoda setter:stabileste numele
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//metoda getter :arata numele
    public String getNombre() {
        return nombre;
    }

    public int hei=1;

}