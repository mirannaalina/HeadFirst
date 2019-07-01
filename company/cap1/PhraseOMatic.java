package com.company.cap1;

public class PhraseOMatic {
    public static void main(String[] args) {

        System.out.println("g");

        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "sixsigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distribute",
                "clustered", "branded", "outside-the-box", "positioned"};

        String[] wordListThree = {"process", "solution", "architectue", "core", "space", "mission"};



//gaseste cate cuvinte sunt in fiecare lista

    int oneLength = wordListOne.length;
    int twoLength = wordListTwo.length;
    int threeLength = wordListThree.length;

//genereaza 3 numere random

     int rand1 = (int) (Math.random()* oneLength);
     int rand2 = (int) (Math.random()* twoLength);
     int rand3 = (int) (Math.random()* threeLength);

// construieste o fraza

      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

//printeaza fraza

     System.out.println("What we need is a "  + phrase);

     }
}
