package day13_methodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

       //input olarak verilen 2 int'i toplayıp sonucu yazdıran bir method olusturun

        int input1=10;
        int input2=20;

        /*
        **********method 4 adımda olusturulur*****
        1- Method call
        2- Argument eklenmesi gerekiyorsa eklenmeli eger method'un return type'i voidden farkli olacaksa bir variable olusturup, method call'u assign edelim
         */

        toplama(input1,input2);

    }

    public static void toplama(int input1 , int input2){
      /*
       3- method deklarasyonunda degistirilmesi gereken bolumleri degistir (access modifier, return type vb..)
       4- eger return type void disinda biseyse  return keyword'u ve donecek degeri hesaplamaliyiz
       */
        System.out.println("Girilen iki sayinin toplami : "+(input1+input2));
    }

}
