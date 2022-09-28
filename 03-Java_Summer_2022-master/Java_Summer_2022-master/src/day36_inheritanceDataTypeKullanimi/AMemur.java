package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class AMemur extends AMuhasebe{

    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+ (30*saatUcreti*gunlukMesai)+ " maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        AMemur mmr1= new AMemur();
        System.out.println(mmr1.gunlukMesai);// 9
        System.out.println(mmr1.saatUcreti);// 12
        mmr1.maas();//Memurlar : 3240 maas alir
        mmr1.ozelSigorta();// Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Personel -> Tum personelimize sigorta yapilir
        System.out.println(mmr1.isim);// APersonel -> Isim belirtilmedi
        System.out.println(mmr1.soyisim);// APersonel -> Soyisim belirtilmedi
        System.out.println(mmr1.departman);// APersonel -> Departman belirtilmedi


        AMuhasebe mhsb1=new AMuhasebe();
        /*
        Her ne kadar AMemur class'inin icinde olsak da
        olusturdugumuz obje AMuhasebe class'indan
        cunku data turu ve constructot AMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        AMuhasebe class'i da obje olusturulabilen bir class'dir yani data turu'dur
         */

        System.out.println(mhsb1.gunlukMesai);// 8 AMuhasebe
        System.out.println(mhsb1.saatUcreti);// 10 AMuhasebe
        mhsb1.maas();//AMuhasebe -> Personel minimum : 2400 maas alir
        mhsb1.ozelSigorta();//AMuhasebe-> Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();//APersonel -> Tum personelimize sigorta yapilir
        System.out.println(mhsb1.isim);// APersonel -> Isim belirtilmedi
        System.out.println(mhsb1.soyisim);// APersonel -> Soyisim belirtilmedi
        System.out.println(mhsb1.departman);// APersonel -> Departman belirtilmedi



    }

}
