package day25_constructor;

public class C02 {
    /*
    Proje olustururken bazi class'lar run etmek icin degil
    variable ve method olusturup
    bunlari baska class'lardan kullanmak icin olusturulur
     */
    /*

    efault constructor, parametresizdir
    goremesek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturulursa
    Java default constructor'i siler
     */

    C02(){

    }
    /*
    Olusturdugumuz parametresiz bu constructor
    default constructor ile bire bir aynidir.
    ama biz olusturdugumuz icin
    buna default constructor demeyiz
    parametresiz constructor deriz
     */

    String isim= "Etka";

    public void method01(){
        System.out.println("C03 method01 calisti");
    }

}
