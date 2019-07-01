package com.company.cap2; //fac parte din acelasi pachet

//clasa main
public class DrumKitTestDrive {

        public static void main (String[]args) {

            DrumKit d=new DrumKit(); //creeaza un obiect numit d

            // apoi sunt invocate metodele create in clasa DrumKit
            d.playSnare ();//fara argumente //variabile de referinta
            d.snare =false;                 //variabile de referinta (ca o telecomanda care controleaza obiectul creat)
            d.playTopHat();

            //daca e fals o ia in considerare , daca e true , n-o mai ia
            if (d.snare ==true) {
                d.playSnare();

            }

        }
}
