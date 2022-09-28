package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok guzel";
        /*
        Verilen bir String de ehrhangi bir Stringveya char'in ilk kullanildigi index'i bize dondurur
         */

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1

        System.out.println(str.indexOf("mek"));//10 -> bunu blok dusunur ve ilk harfin indexini verir

        /*
        eger istedigimiz index'ten sonrasini kontrol etmek istersek
        o zaman ayni method'u iki parametreli olarak kullanabiliriz
         */

        System.out.println(str.indexOf("g",(6+1))); // yazilan index'den  baslar


        // yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2. e'yi bulabilmek icin 1. e'nin index'ine ihtiyacim var

        int ilke= str.indexOf("e");
        int ikincie= str.indexOf("e",ilke);

        //eger 2. index varsa 3. e'nin olup olmadigini ve varsa index'ini yazdiralim

        if (ikincie==-1){
            System.out.println("Verilen str'da 2. e yok");
        }else {
            int ucuncue= str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("Verilen str'da 3. e yok");
            }else {
                System.out.println("Verilen str'da 3. e'nin index'i "+ucuncue);
            }
        }


    }
}
