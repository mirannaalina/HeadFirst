package com.company.cap5;

import java.util.ArrayList;
import java.util.Random;

/*
public class DotComBust {

        //variabile instante
//--1-- declaram si initializam variabilele ce ne trebuiesc

        private GameHelper helper = new GameHelper();//am declara o variabila instanta helper

        private ArrayList<DotCom> dotComsList=new ArrayList<DotCom>();//am creat un arraylist

        private int numOfGuesses=0;//am declarat o variabila care sa tina numaru de incercari


        //metode


    private void setUpGame() {//metoda care creaza obiectele dot com cu numele si locatia

 //--2--make three dotcom objects , give 'em names , and stick 'em in the arraylist

        DotCom dot1 = new DotCom();//am creat primu obiect
        dot1.setName("Pets.com");//i am asociat un nume
        DotCom dot2 = new DotCom();//al 2 lea obiect creat
        dot2.setName("eToys.com");
        DotCom dot3 = new DotCom();//al 3lea obiect creat
        dot3.setName("Go2.com");

        dotComsList.add(dot1);
        dotComsList.add(dot2);
        dotComsList.add(dot3);

        for(DotCom dotcomToSet : dotComsList){//--4--repreat with each dotcom in the list
            ArrayList <String> newLocation =helper.placeDotCom(3);//--5--ask helper for a dotcom location
      //      dotcomToSet.setLocationCells(newLocation);//--6--call the setter on this dotcom to give location
        }


    }

    private void startPlaying() {

        while (!dotComsList.isEmpty()) {//--7--as long as the dotcom list is not empty
            String userGuess = helper.getUserInput("enter a guess");//--8--get user input

        }
    }


    private void checkUserGuess(String userGuess){//--9--call our own checkuserguess method

    numOfGuesses++;//--11--increment the num of guesses the user has made
    String result = "miss";//--12--assume its a miss unless told otherwise

            for(DotCom dotComToTest :dotComsList){//--13--repeat with all dotcoms in the list

                result = dotComToTest.checkYourself(userGuess);//--14--ask the dotcom to check the guesss lookin for hit or kill
                if (result.equals("hit")) {
                  break;//--15--get ot of the loop early , no point in testing others
                }
                  if (result.equals("kill")) {
                    dotComsList.remove(dotComToTest);//--16--this guy is dead so take him out
                    break;
                  }
            }
    System.out.println(result);//--17--print the result for the user
}


    private void finishGame(){//--10-call our own finish game method
      System.out.println("all dot coms are dead ");//--18--print a message to tell the user what he did in the game
       if(numOfGuesses<=18){
          System.out.println ("esti tare");
           }else{
              System.out.println("esti prost");

           }
    }

    public static void main (String[]args){

        DotComBust game =new DotComBust();//--19--create the game object
        game.setUpGame();//--20--tell the game object to set up the game
        game.startPlaying();//--21-tell the game obj to start the main game play loop asking for input
    }






}

*/