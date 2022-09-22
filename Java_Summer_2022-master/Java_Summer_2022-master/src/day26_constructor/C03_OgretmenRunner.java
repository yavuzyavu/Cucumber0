package day26_constructor;

public class C03_OgretmenRunner {
    public static void main(String[] args) {
        C03_Ogretmen ogretmen1=new C03_Ogretmen();
        System.out.println(ogretmen1.toString());

        System.out.println("**************************");

        C03_Ogretmen ogretmen2=new C03_Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");
        System.out.println(ogretmen2.toString());

        System.out.println("**************************");

        C03_Ogretmen ogretmen3=new C03_Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println(ogretmen3.toString());


    }
}
