//am creat o clasa , apoi obiecte din clasa respectiva
public class POO {
    //atributiile exemplu:masina
    String color;
    String marca;
    int km;

    //METODE (poate avea mai multe metode (a frana , a accelera)
    //am folosit DOAR o metoda MAIN

//metodele contin:
    //modificator de acces(in cazu nostru PUBLIC)
    //valoare de returnare (in cazul nostru VOID)--care nu returneaza nimic,putem avea si float,int
    //si numele metodei (in cazul nostru main )
    //in paranteaze sunt argumentele (String []args )


    public static void main (String []args){
        POO coche1 =new POO(); //numele clasei ,orice nume vreau eu +new

           coche1.color = "blanco";
           coche1.marca = "audi";
           coche1.km = 0;


        System.out.println("el color del coche1 es: " +coche1.color);
        System.out.println("el marca del coche1 es: "+coche1.marca);
        System.out.println("el kilo del coche es: "+coche1.km);




        POO coche2 =new POO();
            coche2.color="Rojo";
            coche2.marca="Porsche";
            coche2.km = 100;

        System.out.println("el color del coche2 es: "+coche2.color) ;
        System.out.println("el marca del coche2 es: "+coche2.marca);
        System.out.println("el kilo del coche es: "+coche2.km);

    }

}
