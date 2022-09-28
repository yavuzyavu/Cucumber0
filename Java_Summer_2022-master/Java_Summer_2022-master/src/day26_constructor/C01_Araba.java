package day26_constructor;

public class C01_Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public C01_Araba(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }

    public C01_Araba() {

    }

    /*
    Biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }



}
