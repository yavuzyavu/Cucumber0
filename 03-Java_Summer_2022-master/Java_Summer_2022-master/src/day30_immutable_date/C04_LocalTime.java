package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println(time1);// 19:12:11.642983100

        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarh degildir
        LocalTime.now(); kullandigimiz satirda
        o anki tarih veya saati alip
        bizim variable'imiza store eder.
        time1 variable'inin degeri SABITTIR.
         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println(time1);// 19:17:08.286069100

        System.out.println(time1.getSecond());// 2

        System.out.println(time1.plusSeconds(10000));// 22:18:42.342516500

        System.out.println(time1.minusMinutes(200));// 16:13:53.02126810

        System.out.println(time1.withHour(3));// 03:13:53.02126810

    }
}
