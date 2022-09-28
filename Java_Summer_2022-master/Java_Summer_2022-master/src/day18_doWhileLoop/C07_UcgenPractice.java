package day18_doWhileLoop;

public class C07_UcgenPractice {
    public static void main(String[] args) {
        /*
                *
               * *
              * * *
             * * * *
            * * * * *
            * * * * * *
           * * * * * * *
          * * * * * * * *
         * * * * * * * * *
         ucgeni yaziniz
         */

        int i;
        int j;
        int k;
        for (i=1; i<10; i++) {//satiri olusturmak icin
            for(j=i; j<10;j++) {//sutunu olustumak icin
                System.out.print(" ");//bu satır olmazsa dik ucgen yapar..
            }
            for (k=1; k<=i; k++) {
                System.out.print("*");//istenen karakter
                System.out.print(" ");//yıldızların arasında bosluk icin
            }
            System.out.println(" ");//alt satıra geçmesi için
        }
    }
}
