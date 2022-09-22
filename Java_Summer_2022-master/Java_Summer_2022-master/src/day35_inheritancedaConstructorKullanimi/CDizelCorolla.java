package day35_inheritancedaConstructorKullanimi;

public class CDizelCorolla extends CCorolla{

    CDizelCorolla(){
        System.out.println("CDizelCorolla Parametresiz cons");
    }

    CDizelCorolla(String isim){
        super(isim);
        System.out.println("CDizelCorolla Parametreli cons");
    }

    public static void main(String[] args) {

        CDizelCorolla obj1=new CDizelCorolla("isim");

    }

}
