package day25_constructor;

public class C03_CarRunner {
    public static void main(String[] args) {

        C03_Car car1=new C03_Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nMarka : " + car1.marka + "\nModel : " + car1.model
                            + "\nYil : " + car1.yil + "\nFiyat : " + car1.fiyat);

        System.out.println("*********************************************");

        C03_Car car2=new C03_Car();
        System.out.println("Car2 bilgileri\nMarka : " + car2.marka + "\nModel : " + car2.model
                + "\nYil : " + car2.yil + "\nFiyat : " + car2.fiyat);
        /*
        Her hangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- O obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable'a bir deger aatanmis mi bakar
        3- O zaman data turune gore default degeri atar
         */


    }
}
