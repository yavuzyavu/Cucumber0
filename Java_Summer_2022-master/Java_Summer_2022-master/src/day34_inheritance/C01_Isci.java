package day34_inheritance;

public class C01_Isci extends C01_Personel{

    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    C01_Personel class'indaki tum variable ve method'lara ihtiyaci
    oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    C01_Personel class'ini kendine parent ediniriz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    Bir class baska bir class'i parent edindiginde;
    1- Parent class'daki tum ozelliklere (variable + method) otomatik olarak sahip olur
    2- Parent class'daki ozelliklerden bazilarini kendine uyarlayabili
    3- Parent class'da olmayan bazi yeni ozellikler olusturabilir
    NOT: Parent class'daki ozelliklerden hic birini reddedemez ama degistirebilir
     */

    int persNo=1001;

    public static void main(String[] args) {
        C01_Isci isci1= new C01_Isci();

        System.out.println(isci1.isim);// Isim belirtilmedi
        // Kendi class'imizda isim variable'i yok, onun icin parent'e gideriz

        isci1.isim="Selim";

        System.out.println(isci1.isim);// Selim

        System.out.println(isci1.persNo);// 1001 -persNo kendi class'imizda varswa onu kullaniriz

        isci1.maas();// Isciler minimum €15/saat ucret alir.


    }

    public void maas(){
        System.out.println("Isciler minimum €15/saat ucret alir.");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorrta yaptirilir");
    }



}
