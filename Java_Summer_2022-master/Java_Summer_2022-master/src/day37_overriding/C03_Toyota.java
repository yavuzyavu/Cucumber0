package day37_overriding;

public class C03_Toyota extends C03_Araba{

    @Override
    void marka() {
      /*  super.marka();
      eger hem overridden hem de overriding methodlarin calismasini istersek
      ilk satira super.marka() yazabiliriz.
       */
    }

    void motor(){
        System.out.println("Sırali 6 silindir 2JZ kullanır hocam");
    }

}
