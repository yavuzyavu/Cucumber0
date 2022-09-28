package day19_scope;

public class C01_InstanceVariables {

    /*
    Class icerisinde her yerden kullanmak istediginiz variable'lari
    class'levelda (Class'in icinde ama methodlarin disinda)
    genellikle class level variable'lar classin basinda olusturulur

    class leveldaki variable'lar icin 2 scope vardir
    1- static variables (Class variable'lari da denir)
    2-instance (static olmayan) variables (obje variable'i da denir)
     */

    int instSayi=20; // static olmayip cşlass levelda oldugu icin instance variable'dir

    public static void main(String[] args) {

        int sayi=10;
        /* System.out.println(instSayi);

        instance variables static olmadigi icin main method'dan direkt kullanamayiz
        instance variable'larin diger adi object variable'dir
        dolayisiyla obje olusturursaniz instance variable'lari her yerden kullanabilirsiniz
         */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi); // 20

        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra : "+obje1.instSayi); //30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi); // 20

        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra : "+obje2.instSayi); //25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : "+obje3.instSayi); // 20
        /*
        Her obje olustugunda instance(obje) variable'inin ilk atanan degerini alir
         */
    }

    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        Bir methodun icerisinde olusturulan variable,
        sadece o method'un icinden kullanilabilir
        (Local Variables)
         */
        /*
        istSayi=30;
        instance variable'lara main methdo disindaki static method'lardan da direkt ulasamayiz
        obje olusturursak ulasabiliriz
         */
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println("obje4 degismeden once : "+obje4.instSayi); // 20

    }

    public void staticOlmayanMethod(){
        System.out.println(instSayi);
        /*
        instance variable'lar class iccerisindeki
        static olmayan method'lardan direkt kullanilabilir
         */
    }
}
