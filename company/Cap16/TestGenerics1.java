package com.company.Cap16;

import java.util.ArrayList;

public class TestGenerics1 {
    public static void main (String[]args){
        new TestGenerics1().go();
    }
    public void go(){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimals(animals);

        ArrayList<Dog> dogs =new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
    }
    public void takeAnimals(ArrayList<? extends Animal>animals) {//ca sa poti avea in arraylist si pisici si catei trebuie sa folosesti
        //? extends in metoda
        for(Animal a: animals){
            a.eat();
        }
    }
}


