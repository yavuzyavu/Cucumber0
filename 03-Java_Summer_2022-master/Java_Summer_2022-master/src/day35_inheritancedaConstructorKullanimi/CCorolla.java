package day35_inheritancedaConstructorKullanimi;

public class CCorolla extends CToyota{

    CCorolla(){
        System.out.println("CCorolla Parametresiz cons");
    }

    CCorolla(String isim){
        super(isim);
        System.out.println("CCorolla Parametreli cons");
    }
}
