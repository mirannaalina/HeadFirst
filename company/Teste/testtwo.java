public class testtwo//
{
    byte x;//initializat cu 0
}

class PassO {
    public static void main(String[] args) {//intra in main
        PassO p = new PassO();//se initializeaza obiectul p
        p.start();//variabila de referinta invoca metoda start ,ne ducem la metoda start --
    }

    void start() {//--venim la metoda start unde:
        testtwo t = new testtwo();//initializam obiectul t
        System.out.print(t.x + " ");//se printeaza t concatenat cu x-ul din clasa testtwo ,care nu e initializat,deci 0
        testtwo t2 = fix(t);//se initializeaza un alt obiect t2 care este egal cu metoda fix cu parametrul t --mergem la metoda fix
        System.out.println(t.x + " " + t2.x);//---revenim la main din metoda fix si aflam ca t.x si t2.x sunt ambele valori de 42 42
    }

    testtwo fix(testtwo tt) {//ajunsi la metoda fix cu parametrii(argumentele) tt
        tt.x = 42;//tt concatenat cu x (byte-ul ne initializat) este egala cu 42
        return tt;//ne returneza tt-ul adica 42 ,dupa care ne intoarcem sus la main unde am ramas
    }
}//outputul deci este primul sout cu valoarea 0 apoi dupa ce a sarit prin metoda fix , avem alt output cu 42 42
