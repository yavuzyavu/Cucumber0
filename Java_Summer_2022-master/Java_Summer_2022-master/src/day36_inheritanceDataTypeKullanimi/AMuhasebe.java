package day36_inheritanceDataTypeKullanimi;

public class AMuhasebe extends APersonel{

    protected int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void maas(){

        System.out.println("Memurlar : "+ (30*saatUcreti*gunlukMesai)+ " maas alir");
    }

    protected void ozelSigorta(){

        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }



}
