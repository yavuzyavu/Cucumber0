package day41_abstractClass_Interface;

public class C01_Corolla extends  C01_Toyota{

    /*
    Corolla class'inin 2 tane parent'i var
    corolla parent'larinin ikisinin de standartlarina (abstract method)
    uymak zorundadir

    Concrete bir class parent'i olan tum abstract class'larda
    abstract olan methodlari implement etmek ZORUNDADIR
    Ancak parent silsilesinde override edilerek concrete yapilan methodlari
    override etmek zorunda degildir
     */

    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }


    /*
        Toyota'da abstract method olan motor method'unu
        concrete hale getirdigimiz icin burada kullanmak zorunda kalmadik
     */
//    @Override
//    protected void motor() {
//
//    }
}
