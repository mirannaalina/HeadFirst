public class NumerePare {

    public static void main (String[]args){
        int x=1;
        while (x<20){

            x=x+1;
            if (x % 2==0){
                System.out.println(x+" se iau doar numerele PARE prin catul impartitului care e 0" );
            }

            else if (x %2==1){
                System.out.println(x+" Se iau doar numerele IMPARE prin catul impartitului care e 1");
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("numarul "+i);

        }
        //se foloseste for in locul lui while cand stim exact pana la cat numara.


    }

}
