package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen string'i asagidaki gibi yazdiran bir program yaziniz

        input=Deniz
        D
        De
        Den
        Deni
        Deni
        Deniz
         */

        String input="ankara";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j-1,j));// iilk harf icin substring (0,1) olmali
            }
            System.out.println();
        }

    }
}
