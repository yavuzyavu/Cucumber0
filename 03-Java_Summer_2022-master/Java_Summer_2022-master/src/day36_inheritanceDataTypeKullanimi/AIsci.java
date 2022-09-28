package day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class AIsci extends AMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;


    protected void maasIsci(){
        System.out.println("Isciler : "+ (30*saatUcreti*gunlukMesai)+ " maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Memurlar %70 indirimli ozel sigorta yaptirabilir");
    }

    

    public static void main(String[] args) {

        AMuhasebe isc1= new AIsci();
        
        /*
        Bir obje olusturulurken 
        Data turu ve constructor ayni class'dan ise
        direk  class'a gidiyorduk
        
        Eger data turu ve constructor farkli ise
        Obje constructor'in oldugu class'in objesidir
        ancak bizden istenen
        Isci class'indaki spesifik ozellikler degil
        bir iscinin AMuhasebe class'indaki
        tum calisanalrla beraber sahip oldugu
        genel ozellikleri yazdirir
         */

        System.out.println(isc1.gunlukMesai);// AMuhasebe -> 8
        System.out.println(isc1.saatUcreti);// AMuhasebe -> 10
        isc1.maas();// AMuhasebe -> Memurlar : 2400 maas alir
        isc1.ozelSigorta();// AMuhasebe -> Memurlar %60 indirimli ozel sigorta yaptirabilir
        isc1.sigorta();// APersonel -> Tum personelimize sigorta yapilir
        System.out.println(isc1.isim);//  APersonel -> Isim belirtilmedi
        System.out.println(isc1.soyisim);//  APersonel -> Soyisim belirtilmedi
        System.out.println(isc1.departman);// APersonel -> Departman belirtilmedi

        System.out.println("***********************************************");

        APersonel isc2=new AIsci();

 //       System.out.println(isc2.gunlukMesai);//
 //       System.out.println(isc2.saatUcreti);//
        isc2.maas();// AMuhasebe -> Memurlar : 2400 maas alir
 //       isc2.ozelSigorta();// AMuhasebe ->
        isc2.sigorta();// APersonel -> Tum personelimize sigorta yapilir
        System.out.println(isc2.isim);//  APersonel -> Isim belirtilmedi
        System.out.println(isc2.soyisim);//  APersonel -> Soyisim belirtilmedi
        System.out.println(isc2.departman);// APersonel -> Departman belirtilmedi

        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir
        ama child'a donus olmaz
        Aradigi ozelligi bulamazsa CTE verir
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();

        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranr
        list3 Queue gibi davranir
         */

    }

}
