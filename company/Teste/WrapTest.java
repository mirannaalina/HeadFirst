public class WrapTest
{
    public static void main(String [] args)
    {
        int result = 0;
        short s = 42;
        Long x = new Long("42");
        Long y = new Long(42);
        Short z = new Short("42");
        Short x2 = new Short(s);
        Integer y2 = new Integer("42");
        Integer z2 = new Integer(42);

        if (x == y) //nu sunt egale pt ca au valori diferite unu e "42"si celalalt 42
            //daca era (x==y2) dadea eroare ,nici nu intra in comparatie ,trebuie aceleasi marimi ,apoi verifica valoarea lor
            result = 1;
        if (x.equals(y) ) //amandoua sunt long ,long ,deci egale
            result = result + 10;
        if (x.equals(z) ) //x e long si z e short , nu sunt egale
            result = result + 100;
        if (x.equals(x2) ) /* Line 19 */
            result = result + 1000;
        if (x.equals(z2) ) /* Line 21 */
            result = result + 10000;

        System.out.println("result = " + result);
    }
}

