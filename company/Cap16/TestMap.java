package com.company.Cap16;

import java.util.*;

//HashMAP
public class TestMap {
    public static void main (String []args){
        HashMap<String ,Integer> scores = new HashMap<String, Integer>();//hashmap are nevoie de 2 parametrii,unu pt key si unu value
        scores.put("Katy",42);
        scores.put("bert",234);  //folosim put in loc de add() si ia 2 argumente (hey,value )
        scores.put("skyle",430);

        System.out.println(scores);
        System.out.println(scores.get("bert")); //metoda get ia cheia si returneaza o valoare(in cazul asta integer)
    }
}
