package day41_abstractClass_Interface;

public abstract class C01_Toyota extends C01_Araba{


    @Override
    protected void motor() {

        System.out.println("Toyota arabalar cevreci motor kullanir");
    }
    /*
    parent class'daki standart belirleyici methodlar
    (abstract method)'larin tamami childclass tarafindan override edilmelidir.

    concrete method'larin override edilme mecburiyeti yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    aslinda Toyota Class'i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz
    Toyota class'ini da abstract yapmaniz guzel olur
     */
}
