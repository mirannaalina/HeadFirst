package com.company.cap7;

public class MonsterTestDrive {
    public static void main (String[]args){
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] =new Dragon ();
        ma[2] = new Monster();

        for(int x=0;x< 3;x++) {//numara 0,1,2
            ma[x].frighten(x); //obiectu initiat cu x-ul de la numaratoare  concatenat cu metoda frica
            //inseamna ca te sperie odata vampiru , apoi dragonu apoi monstru
        }
    }
}
class Monster { //aici vine A
    boolean frighten (int d) {
        System.out.println ("arhhg");
        return true;
    }


}
class Vampire extends Monster {//aici vine B

    boolean frighten(int x) {
        System.out.println("a bite?");
        return true;
    }

}
class Dragon extends Monster{
    boolean frighten (int degree){
        System.out.println("breath fire");
        return true;
    }
}
