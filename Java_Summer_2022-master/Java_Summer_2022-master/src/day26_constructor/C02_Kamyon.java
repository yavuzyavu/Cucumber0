package day26_constructor;

public class C02_Kamyon {
    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public C02_Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        bizim temel amacimiz C02_KamyonRunner'da argument olarak girilen degerin
        C02_Kamyon class'inda instance variable'a atanmasi
        Ancak SCOPE konusunda ogrendigimiz gibi
        C02_Kamyon constructor scope'unda marka oldugu icin
        instance marka'ya gitmiyor

        Bu karisikligi gidermek icin instance variable'lari
        belirli hale getirmemiz lazım
        Java bunun icin this keyword'u olusturmustur

        Genel kullanim acisindan this keyword'u kodu herkesin anlamasini
        kolaylastirdigi icin tercih edilir
        */
    }

    public C02_Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public C02_Kamyon() {

    }



    @Override
    public String toString() {
        return "\nmarka : " + marka +
                "\nmodel : " + model +
                "\nyil : " + yil +
                "\nfiyat : " + fiyat ;
    }
}
