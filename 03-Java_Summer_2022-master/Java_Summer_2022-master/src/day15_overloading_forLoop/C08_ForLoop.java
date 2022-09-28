package day15_overloading_forLoop;

public class C08_ForLoop {
    public static void main(String[] args) {
        /*
        input olarak verilen bit tam sayi icin faktoriyel hesaplayip yazdiran bir method olusturun
        
        verilen sayi negatif veya 20'den buyuk olursa
        "girilen sayinin faktoriyeli hesaplanamaz" uarisi yazsin
         */
        int input=6;
        
        faktoriyelHesapla(input);
        
    }

    private static void faktoriyelHesapla(int input) {
        int faktoriyel=1;

        if (input<0 || input > 20){
            System.out.println("girilen sayinin faktoriyeli hesaplanamaz");
        }else if (input==0){
            System.out.println("0! = 1'dir");
        } else {
            for (int i = 1; i <= input; i++) {
                faktoriyel*=i;
            }
            System.out.println("faktoriyel degeri : "+faktoriyel);
        }
    }
}
