package day41_abstractClass_Interface;

public class C01_Mercedes extends C01_Araba{
    @Override
    protected void yakit() {
     /*
     abstract bir parent'in concrete child class inherit ederse
     parent abstract class'daki tum abstract methodlari
     override etmek zorundadir

     abstract bir class, abstract baska bir class'i parent edinirse
     parent class'daki tum abstract method'lari override etmek
     ZORUNDA DEGILDIR

      */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
