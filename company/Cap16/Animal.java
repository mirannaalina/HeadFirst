package com.company.Cap16;

public abstract class Animal {
    void eat() {
        System.out.println("animal eating");
    }
}
class Dog extends Animal {
    void bark(){}
}
class Cat extends Animal {
    void meow(){}
}
