package day41_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class C01_A160 extends C01_Mercedes{

    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parent'i olan tum class'lardaki abstract method'lari
    concrete hale donusturmek (override) ZORUNDADIR

    Bu kuralin istisnasi
    parent class'lardan herhangi birinde
    concrete hale donusturulmus , abstract method'lardir

     */

    public static void main(String[] args) {
        C01_A160 arb1= new C01_A160();
        // concrete bir class'dan istedigimiz objeyi uretebiliriz

        C01_Mercedes arb2= new C01_Mercedes();
        // mercedes'de concrete

//        C01_Toyota arb3= new C01_Toyota();
        C01_Toyota arb4=new C01_Corolla();
        // abstract class'lar constructor barindirir ama obje uretemezler
        // Toyota class'i abstract class oldugundan obje uretilemez

        /*
        List<String> list1= new List<String>();
        List<String> list2= new ArrayList<>();

        Abstract bir class'in ozelliklerini tasiyan bir obje olusturmak istedigimizde
        Data turunu istedigimiz abstract class
        costructor'i ise child'i olan concrete bir class'dan seceriz
        */
    }

}
