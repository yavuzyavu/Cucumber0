package day39_exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }}

    private static void calis() {

        throw new RuntimeException("Coook calis");

        /*
        throw ile kontrollu exception olusturulurken
        parametre olarak istedigimiz hata mesajini girebiliriz
        */
    }
}
