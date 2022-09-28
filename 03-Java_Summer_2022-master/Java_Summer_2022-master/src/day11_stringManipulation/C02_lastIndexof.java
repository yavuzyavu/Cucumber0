package day11_stringManipulation;

public class C02_lastIndexof {
    public static void main(String[] args) {

        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        /*
        Verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
            - verilen kelime cumlede kullanilmamis
            - verilen kelime cumlede sadece 1 kere kullanilmis
            - verilen kelime cumlede birden fazla  kullanilmis
        */

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelmeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1){
            System.out.println("verilen kelime cumlede kullanilmamis ");
        }else if (kelimeIlkIndex == kelmeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede birden fazla  kullanilmis");
        }


    }
}
