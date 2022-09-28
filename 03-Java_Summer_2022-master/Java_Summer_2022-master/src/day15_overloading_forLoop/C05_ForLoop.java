package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 1'den 5'e kadar olan tam sayilari toplayalim

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);

        // 30 dahil, 50 haric cift sayilari toplayin

        toplam=0;

        for (int i = 30; i < 50; i+=2) {
                toplam+=i;

        }
        System.out.println("30-50 arasi cift sayilar toplami : "+toplam);

// 2. yontem
        toplam=0;

        for (int i = 30; i < 50; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 arasi cift sayilar toplami : "+toplam);

        // 1500 ile 1600 arasinda 7 ile bolunebilen sayilari toplayin
        toplam=0;
        for (int i = 1500; i <= 1600; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("1500-1600 arasi 7'ye bolunen sayilar toplami : "+toplam);


    }
}
