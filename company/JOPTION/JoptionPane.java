package com.company.JOPTION;

import javax.swing.*;

//intrare si iesire de date in fereastra
public class JoptionPane {
    public static void main (String[]args){
        String string;
        int integer;
        char litera;
        double decimal;

        string= JOptionPane.showInputDialog("zi un string: ");//mesaju dat in fereastra e pastrat in variabila string
        integer =Integer.parseInt(JOptionPane.showInputDialog("zi un integer "));//nu putem pastra un string in integer si trebuie conversat

//e imposibila conversia dintr-un string intr-un intreg  ;fereastra arata un string ,iar noi vrem un integer ,conversia se face cu parseint
 //transformam totul in integer cu integer.parseint

        litera =JOptionPane.showInputDialog("zi un o litera,caracter : ").charAt(0);//charAt arata doar un caracter,primul
        decimal=Double.parseDouble(JOptionPane.showInputDialog("zi un nr decimal : "));//acum conversam stringu in double


        //deci prima data am luat datele de la utilizator , iar acum le afisam prin showmessagedialog
        JOptionPane.showMessageDialog(null,"stringu este: "+string);
        JOptionPane.showMessageDialog(null,"nr integer este : "+integer);
        JOptionPane.showMessageDialog(null,"litera este: "+litera);
        JOptionPane.showMessageDialog(null,"decimalul este: "+decimal);





    }

}
