package day15_overloading_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen  Stringi terse cevirip yazdiran method olusturunuz

        String input= "Java gun gectikce guzellesiyor";

        terstenYazdir(input);

        }

    public static void terstenYazdir(String input) {

        String tersInput="";

        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }

        System.out.println(tersInput);

    }


}
