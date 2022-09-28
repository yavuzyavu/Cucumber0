package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        Javada olusturdugumuz methodlarin isminin yaptigi islev ile uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java
        2 adet substring() method'u veya
        Verilen Stringdeki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var

        Java ayni isimde  birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve parametrelerin data turune gore karar verir
         */

        String str= "Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,7);
        str.replace('c','v');
        str.replace("J","H");
        //str.replace(4,8);

        /*
        Ayni isimde ama farkli method'lari olusturmak icin
        degistirecegimiz seyler

        1- Parametre sayisi
        2- Ayni sayida parametreye sahip olsa bile, parametrelerin data turleri
        3- Ayni sayida ve ayni data turunde parametreli olan methodlarda parametrelerin siralanisi

         */


    }
}
