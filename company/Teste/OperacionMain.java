import javax.swing.*;

public class OperacionMain {
    public static void main(String[] args) {  //clasa MAIN este separata de celelalte clase

        //metoda pentru ai spune utilizatorului sa ne dea 2 numere
        int n1 =Integer.parseInt(JOptionPane.showInputDialog("Scrie un numar:"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Mai scrie unul:"));

        //aici cream un obiect
        Operacion op = new Operacion(); //operacion e numele clasei ,op este numele obiectului

        //aici invocam metodele create din clasa operacion

       int suma = op.sumaNumerelor(n1 ,n2);//aici sunt argumentele create in parametrii din clasa operacion

        op.diferentaNumerelor(n1,n2); //variabile de referinta

       System.out.println("inmultirea este : " + op.inmultireaNumerelor(n1,n2)); //daca returna void nu puteam concatena.
       System.out.println("impartirea este : " + op.impartireaNumerelor(n1,n2));

        op.arataRezultatul(suma); //suma este argumentul
    }


}
