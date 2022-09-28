package day37_overriding;

public class C03_Araba {

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
         Parent class'dan override edilmesini istemedigimiz method'lari
         private, static veya final yapabiliriz
         */
    }
    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }

}
