package day43_Interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();


    /*
     Normal bir class'da oldugumuzu dusunursek
     iki tane access modifier kullanma ihtmali OLAMAZ

     asagidaki method'da goreceginiz gibi
     interface'de istisnai olarak body'si olan method'lar olusturulabilir
     Bu ozellik Java 8'den sonra kullanilmaya baslanilmistir.
     Bu ozellikten once, bir interface'e yeni bir method eklememiz gerektiginde
     eskiden beri bu interface'i implement eden tum class'lara gidip
     yeni eklenen method'u override etmemiz gerekirdi

     bu ozellik sayesinde basina default veya static keyword ekleyerek
     interface'de yeni ve body'si olan bir method olusturursak
     bu method'un child class'lar tarafindan override edilme MECBURIYETI OLMAZ
     ve eskiden immplement etmis class'lari degistirmemiz gerekmez

     Bu istisnai bir durumdur ve interface icin olusturulan genel kurallari bozmaz

     Bu methodlarin body'si olsa da bunlara concrete method denmez
     ama override edilme mecburiyetleri yoktur

     Buradaki default keyword'u access modifier degil
     istisnai durumun belirtilmesi icindir

     O zaman niçin 2 keyword(static ve default) tanimlanmistir?
     Bu iki farkli kelimenin amaci
     child class'lardan bu method'a nasil erisilebilecegini belirlemek icindir
     static keyword kullanilirsa, child classlardan bu methoda erismek icin
     InterfaceAdi.methodAdi() yeterli olur

     default keyword kullanilirsa, method'a erisek icin obje olusturulmalidir

     */

    public default void teker(){
        System.out.println("tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("tum arabalarin direksiyonu vardir");
    }

}
