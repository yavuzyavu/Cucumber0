package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str= "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // J ilk harfi dondurur

        System.out.println(str.toUpperCase().charAt(7));// R 7. indexi buyuterek alir

        System.out.println(str.charAt(21)); // l

        // System.out.println(str.charAt(22));
// son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
// eger index olarak uzunlugu veya daha buyuk bir sayiyi girersek Java Exception verir


        // charAt() methodu kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz.
        // kullanmamiz gereken bir method varsa
        // charAt()'den once kullanmaliyiz

    }
}
