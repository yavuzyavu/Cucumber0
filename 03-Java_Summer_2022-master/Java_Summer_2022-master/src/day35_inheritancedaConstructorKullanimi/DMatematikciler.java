package day35_inheritancedaConstructorKullanimi;

public class DMatematikciler extends DOgretmen{

    DMatematikciler(){
        System.out.println("Matematikciler parametresiz cons");
    }

    DMatematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli cons");
    }

    public static void main(String[] args) {

        DMatematikciler obj1=new DMatematikciler("Tugba");

    }

}
