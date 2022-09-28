package day41_abstractClass_Interface;

public abstract class C01_Araba {
    public static void main(String[] args) {

        /*
        Abstract class'da main method opsiyoneldir
        Eger abstract class sadece child class'larin
        tasimak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
        main method'a ihtiyac olmaz
        sadece abstract method'lar olur

        ama bir abstract method'da
        standart belirlemek disinda da
        method'lar calisabilir
        bu durumda ihtiyac olursa main method olusturulabilir

         */
    }

    int sayi=10;

    protected abstract void yakit();

    protected abstract void kaporta();

    protected abstract void motor();
    /*
    Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
    abstract method olur ve abstract methodlarin body'si olmaz
     */

    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
        abstract olmayan method'lara concrete method denir.
        abstract bir methodu abstract keyword ile belirtmek ZORUNLUDUR
        concrete method'larda bunun deklare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }


}
