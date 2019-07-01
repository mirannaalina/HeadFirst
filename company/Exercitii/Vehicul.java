package com.company.Exercitii;

/*
Construieste un program ce da o serie de masini caracterizate prin marca,model si pret,si imprima proprietatiile vehicului cel mai ieftin
Pentru asta , trebuie sa se citeasca de la tastatura caracteristicile fiecarui vehicul si sa se creeze o clasa
ce reprezinta fiecare vehicul..
 */

public class Vehicul {

   private String marca;
   private String model;
   private float pret;

   public Vehicul(String marca, String model, float pret){
      this.marca= marca;
      this.model= model;
      this.pret=pret;

   }
   public float getPret(){
      return pret;
   }
   public String arataDate(){
      return "Marca: " +marca+"\nModelul: "+model+"\nPret: "+pret+"\n";
   }

}
