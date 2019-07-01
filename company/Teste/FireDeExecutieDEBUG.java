package com.company.Teste;

public class FireDeExecutieDEBUG implements Runnable {//interfata runnable are o singura metoda RUN ce trebuie musai folosita
    public static void main (String[]args) {
        FireDeExecutieDEBUG runner = new FireDeExecutieDEBUG();//cream o instanta Runnable
        Thread alpha = new Thread(runner);//am creat 2 fire de executie
        Thread beta = new Thread(runner);

        alpha.setName("Firul de executie ALPHA");//seteaza numele fiecarui fir
        beta.setName("Firul de executie BETA");

        alpha.start();//porneste firele de executie
        beta.start();
    }

        public void run (){
        for(int i=0;i<25;i++){ //fiecare fir intra de 25 de ori in loop si afiseaza numele firului
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " ruleaza ");
        }
    }



}
