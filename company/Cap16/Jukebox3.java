package com.company.Cap16;

import java.io.*;
import java.util.*;

public class Jukebox3 {
    ArrayList<Song> songList = new ArrayList<Song>();  //pastram titlurile de melodii intr-un arraylist de stringuri

    public static void main(String[] args) {
        new Jukebox1().go();

    }

    public void go() {  //metoda care incepe incarcarea melodiilor si printeaza apoi contentu lui songlist din arraylist
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);//cheama metoda static collection sort
        System.out.println(songList);//si cand printam a doua oara deja este in ordine alfabetica


    }

    void getSongs() {
        try {
            File file = new File("SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {//atata timp cat reader line nu e null
                addSong(line);  //sparge titlu si artistu in doua
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {   //metoda add song sparge liniile in 2 parti(tokene)(titlu si artist) folosind metoda split()
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}


