package day34_inheritance;

public class C01_Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa
    veya ileride bu class'i parent yapmak isteyenler olabilir diyorsaniz
    variable ve method'larin access modifier'ini protected yapmaliyiz
     */

    protected int persNo;
    protected String isim= "Isim belirtilmedi";
    protected String departman="Departman Belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("tum perspnel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }

}
