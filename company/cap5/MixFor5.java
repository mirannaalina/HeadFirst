package com.company.cap5;

public class MixFor5 {
    public static void main (String []args){
        int x=0;
        int y=30;
        for (int outer = 0;outer <3;outer++){//0,1,2
            for(int inner=4; inner>1;inner--){//4,3,2
               // -------;
                y=y-2;
                if(x==8){
                    break;
                }
                x=x+3;//repeta asta de  2 ori
                //atata timp cat conditia e adevarata
                //0=0+3 ,x vine 3 dupa 3=3+3 ,x vine 6
            }
            y=y-2;//se repeta tot de 2 ori cat conditia e adevarata
            //30=30-2 ,y =28 dupa 28=28-2 ,y=26

        }
       System.out.println(x + " "+y) ;
    }
}
