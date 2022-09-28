package day33_encapsulation;

public class C02_OgretmenRunner {
    public static void main(String[] args) {

        C02_Ogretmen ogr1=new C02_Ogretmen();

        ogr1.setIsim("Tulay");
        System.out.println(ogr1.getIsim());
        /*
        Bu yontemle data hiding degil
        daha anlasilir bir kod amaclanmis olur
         */

    }
}
