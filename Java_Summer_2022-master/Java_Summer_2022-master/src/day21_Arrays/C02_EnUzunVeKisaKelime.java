package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        // Soru 2- Verilen string bir array'de en uzun ve en kisa String'leri yazdiran method olusturun

        String isimler[]={"Erdal","Onur","Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisaYazdir(isimler);


    }

    public static void enUzunVeKisaYazdir(String[] isimler) {
        String enUzunKelime= isimler[0];
        String enKisaKelime= isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }

            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }

        System.out.println("Araydeki en uzun kelime : "+enUzunKelime);
        System.out.println("Araydeki en kisa kelime : "+enKisaKelime);

    }
}
