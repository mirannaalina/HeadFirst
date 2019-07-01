public class Operacion {

    //Atributii


   //int suma; //variabile globale PRIMITIVE
    int resta;
   int multiplication;
   int division;


    //METODE


//METODA INTEGER
    //metoda care insumeaza numerele pe care le da utilizatorul
    public int sumaNumerelor (int numero1 ,int numero2)// astia sunt parametrii unei metode//variabile locale
    {
         int suma = numero1 + numero2;
        return suma ;
    }

 // METODA VOID
    //metoda care scade numerele pe care le-a dat utilizatorul
    public void diferentaNumerelor(int numero1 ,int numero2){

        resta = numero1-numero2;
    }

//METODA INTEGER
    //metoda care inmulteste numerele pe care le-a dat utilizatorul
    public int inmultireaNumerelor (int numero1 ,int numero2){

        int multi =multiplication = numero1*numero2;
        return multi ;
   }
//METODA FLOAT
    //metoda care imparte numerele pe care le-a dat utilizatorul
    public float impartireaNumerelor(int numero1 ,int numero2){

        float div =division = numero1/numero2;
        return div; //cand avem un int , trebuie sa ne returneze neaparat un intreg

    }
 //metoda care afiseaza rezultatele

    public void arataRezultatul(int suma){ //int suma este parametrul
        System.out.println("suma este :" +suma);
        System.out.println("diferenta este : "+resta);
       // System.out.println("inmultirea este : "+multiplication);
       // System.out.println("impartirea este : "+division);
   }




}
