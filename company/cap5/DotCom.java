package com.company.cap5;

import java.util.ArrayList;

public class DotCom {

        String go, pets, askme;

        //atributii

        //am delcarat un array ca sa tina locul celulelor.
        // int[] locationCells ;

        //schimba array ul int de mai sus cu un ArrayList ca sa tina Stringurile

        private ArrayList<String> locationCells;
        private String name;


        //am creat un int ca sa tina numarul de incercari.

        //int numOfHits = 0;


        //metode

        //public void setLocationCells (int[] locs) { //metoda de setat locatia celulelor

        //schimbam metoda cu ArrayList modificand in loc de int [] arraylist<string>

    public void SetLocationCells(ArrayList<String> loc) {

            locationCells = loc; //aici sunt stocate casutele castigatoare


        }

        public void setName(String n){
        name =n;
        }

        public String checkYourself(String userInput) { //metoda de verificat daca am atins vreo celula
            //castigatoare

            String result = "miss";

            int index = locationCells.indexOf(userInput);//gaseste daca raspunsul utilizatorului este in lista,intreband
            //de index , daca nu e in lista ,atunci indexOf () se intoarce la -1

            if (index >= 0) {//daca indexu e mai mare sau =0 raspunu utilizatorului este cu siguranta in lista ,
                locationCells.remove(index); // deci il sterge

                if (locationCells.isEmpty()) {//daca casutele sunt goale , returneaza kill
                    result = "kill";
                } else {
                    result = "hit";//daca nu sunt goale , e hit
                }
            }


            return result;


        }

    }
