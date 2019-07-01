package com.company.Cap12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel {

    public void paintComponent (Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);

        Image image =new ImageIcon("h.jpg").getImage();
       // g.drawImage(image,3,4,this);

        //g.fillRect(0,0,this.getWidth(),this.getHeight());//umplem tot cu negreu,default

        int red=(int) (Math.random() *256);
        int green=(int) (Math.random() *256);
        int blue=(int) (Math.random()*256);

        Color randomColor =new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);
    }
}
