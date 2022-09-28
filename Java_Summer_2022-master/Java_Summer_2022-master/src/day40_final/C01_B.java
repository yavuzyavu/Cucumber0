package day40_final;

final public class C01_B extends C01_A{

    public static void main(String[] args) {

        C01_B obj=new C01_B();

        obj.isim="Alp";

        System.out.println(C01_A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */
    }

}
