package com.company.Cap16;

import java.io.*;
import java.util.*;

public class Jukebox5 {
    ArrayList<Song> songList = new ArrayList<Song>();
    public static void main (String[]args){
        new Jukebox5().go();
    }

    class ArtistCompare implements Comparator<Song>{ //cream o clasa inner ce implementeaza comparator
        public int compare(Song one ,Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    public void go(){
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();//cream un obiect al comparatorului inner class
        Collections.sort(songList,artistCompare);//invocam sort ,trecem numele listei si o referinta a noului obiect comparat

        System.out.println(songList);
    }
    void getSongs(){
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {//atata timp cat reader line nu e null
                addSong(line);  //sparge titlu si artistu in doua
            }
        } catch (Exception ex) {
            ex.printStackTrace();}

    }
    void addSong (String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }

}
