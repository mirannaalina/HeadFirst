public class BoolArray {

        boolean [] b = new boolean[3];//toate sunt setate pe false
        int count = 0;

        void set(boolean [] x, int i)//in metoda set se seteaza pe true arrayurile
        {
            x[i] = true;
            ++count;//si se numara
        }

        public static void main(String [] args)//intra in main si initiaza ba
        {
            BoolArray ba = new BoolArray();
            ba.set(ba.b, 0);//apoi in variabila de referinta concateneaza metoda set care are parametrii array-ului meu b de mai sus cu indicele 0
            //merge inapoi la metoda set si numara 1 ,dupa ce a setat 0 pe true si a numarat 1 ,revine aici in  main si trece la linia de mai jos
            ba.set(ba.b, 2);//revine si ia indexu cu nr 2 din arrayul meu, dupa care merge inapoi la metoda set si seteaza 2 pe true si mai numara 1 , count devine 2
            ba.test();//si iar revine la main unde apeleaza acum metoda test
        }

        void test()//intra in test
        {
            if ( b[0] && b[1] | b[2] )//verifica conditia si count se transforma in 3
                count++;
            if ( b[1] && b[(++count - 2)] )//sare peste dracovenia asta
                count += 7;
            System.out.println("count = " + count);//si printeaza count = 3
        }
    }

