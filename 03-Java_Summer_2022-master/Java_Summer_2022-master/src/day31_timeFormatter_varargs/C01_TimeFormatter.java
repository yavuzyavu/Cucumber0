package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("ilk olusturulan tarih : "+tarihSaat);// ilk olusturulan tarih : 2022-07-25T21:40:41.922493

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm");

        System.out.println(dtf.format(tarihSaat));// 25/Jul/2022 21:49

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm a");

        System.out.println(dtf1.format(tarihSaat));// 25/7/22 09:49 PM



    }
}
