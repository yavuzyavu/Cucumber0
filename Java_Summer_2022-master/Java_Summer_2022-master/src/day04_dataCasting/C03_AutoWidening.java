package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        //dar veri turundeki bir degeri genis veri turundeki variable'a
        // otomatik olarak assign eder

       byte sayi1=23;
       short sayi2=55;
       int sayi3=sayi1+sayi2; //88

        double sayi4=sayi1*sayi2;

        sayi4= sayi2/sayi1; //2.391304347826087.. olmali amaaaaa ...
        System.out.println("sayi4 = " + sayi4);//2.0

        double sayi5=sayi1*sayi2;
        sayi5= (double) sayi2/sayi1;
        System.out.println("sayi5 = " + sayi5);//2.391304347826087


    }
}
