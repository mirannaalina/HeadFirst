package com.company.Cap16;

import java.io.*;
import java.util.*;


//Hashset
public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<Song>();
    //

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<Song>();  //set-ul nu accepta duplicarile MAP(key) sau LIST(index) le accepta
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    void getSongs() {
        try {
            File file = new File("songListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    void addSong (String lineToParse){
        String[]tokens =lineToParse.split("/");


    }
}

