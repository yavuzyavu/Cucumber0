package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        // iki tarih arassindaki sureyi bulma

        LocalDate tarih1= LocalDate.of(1997,04,29);
        LocalDate bugün= LocalDate.now();

        Period period = Period.between(tarih1,bugün);

        System.out.println("period = " + period);// P25Y2M24D

        System.out.println(period.getYears());// 25


    }
}
