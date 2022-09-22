package day35_inheritancedaConstructorKullanimi;

public class CToyota {

    CToyota(){
        System.out.println("CToyota Parametresiz cons");
    }

    CToyota(String isim){
        //super(isim); -> extends olmadigi icin super() cons call'u java kabul etmez
        System.out.println("CToyota Parametreli cons");
    }

}
