public class Persoana {
    //atributiile

    String nume;
    int varsta;

    //metode

    //METODA CONSTRUCTOR

    public Persoana (String nume ,int _varsta) {

        //nu trebuie sa fie la fel (atributiile cu parametrii)
        ///daca pui this. stie ca asta e atributul
        //si ce nu are this e parametrul contructorului
        this.nume = nume;
        varsta = _varsta;


    }

    public void aratrezultatul () {

        System.out.println("Numele este : "+nume);
        System.out.println("Varsta este : "+varsta);

    }


}
