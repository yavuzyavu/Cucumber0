package day35_inheritancedaConstructorKullanimi;

public class DOgretmen {

    DOgretmen(){
        System.out.println("Ogretmen parametresiz cons");
    }

    DOgretmen(String isim){
        this();
        System.out.println("Ogretmen parametreli cons");
    }
}
