package day26_constructor;

public class C03_Ogretmen {
    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";

    public C03_Ogretmen() {
    }

    public C03_Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public C03_Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "C03_Ogretmen " +
                "\nisim='" + isim + '\'' +
                "\nsoyisim='" + soyisim + '\'' +
                "\ndogumTarihi='" + dogumTarihi + '\'' +
                "\nbrans='" + brans + '\'' +
                "\nyanBrans='" + yanBrans + '\'';
    }
}
