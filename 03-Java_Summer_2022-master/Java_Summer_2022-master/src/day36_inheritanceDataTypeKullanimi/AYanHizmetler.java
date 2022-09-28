package day36_inheritanceDataTypeKullanimi;

public class AYanHizmetler extends AMuhasebe{

    protected int saatUcreti=9;
    protected int gunlukMesai=8;


    protected void maas(){

        System.out.println("Yan Hizmetler : "+ (30*saatUcreti*gunlukMesai)+ " maas alir");
    }

    protected void issizlikSigorta(){

        System.out.println("Yan Hizmetler %30 indirimli issizlik igortasi yaptirir");
    }


    public static void main(String[] args) {

        /*
        overriding chil class'daki bir method'un
        parent class'daki ayni isimdeki method'u
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding'i  nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise

        eger bir obje olusturulurken
        data turu ve constructorr farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz

        1- Obje constructor'un oldugu class'da olusur
        2- Objenin ozelliklerini aramaya Data Turu'nun oldugu class'dan baslariz
            bu class'da aranan ozellik bulunmazsa parent class'lara bakilir
            orada da bulamazsak CTE verir

        3-Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
           Aranan ozellik method ise
           degeri yazdirmadan once
           override edilmis mi kontrol etmemiz gerekir
           eger override edildiyse en guncel degeri yazdiririz
         */

        AMuhasebe yh1= new AYanHizmetler();

        System.out.println(yh1.gunlukMesai);// AMuhasebe -> 8
        System.out.println(yh1.saatUcreti);// AMuhasebe -> 10
        yh1.maas();// AYanHizmetler -> Yan Hizmetler : 2160 maas alir
        yh1.ozelSigorta();// AMuhasebe -> Memurlar %60 indirimli ozel sigorta yaptirabilir
        yh1.sigorta();// APersonel -> Tum personelimize sigorta yapilir
        System.out.println(yh1.isim);// APersonel -> Isim belirtilmedi
        System.out.println(yh1.soyisim);// APersonel -> Soyisim belirtilmedi
        System.out.println(yh1.departman);//APersonel -> Departman belirtilmedi
    //    System.out.println(yh1.issizlikSigorta);
            /*
            Aramaya AMuhasebe'den basladigimizdan
            issizlikSigortasi bulamadik CTE verir
             */


        System.out.println("***********************************************");

    }

}
