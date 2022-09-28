package day35_inheritancedaConstructorKullanimi;

public class BMuhasebe extends BPersonel{

    BMuhasebe(){
        System.out.println("Muhasebe parametresiz cons");
    }

    BMuhasebe(String isim){
        System.out.println("Muhasebe parametreli cons");
    }

}
