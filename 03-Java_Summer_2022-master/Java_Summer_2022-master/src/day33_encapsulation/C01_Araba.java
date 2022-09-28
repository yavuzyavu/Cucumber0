package day33_encapsulation;

public class C01_Araba {

    String marka="Marka Belirtilmedi";// marka'nin access modifier'i default access modifier
                                        // oldugundan, package icerisinde kullanilabilir
    private String model="Model Belirtilmedi";
    private String yakıt="Elektrikli"; // tum arabalar elektrikli ise bu variable'iin degistirilmemesi lazimdir
        // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulmesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor(getter)
    // bunun icin

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakıt() {
        return yakıt;
    }
}
