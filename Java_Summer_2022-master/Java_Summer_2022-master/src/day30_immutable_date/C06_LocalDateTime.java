package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat);// 2022-07-23T19:40:52.578349600

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T23:42:13.264610100

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-04-18T23:43:15.219692500

        System.out.println(tarihSaat.toLocalDate());// 2022-07-23
    }
}
