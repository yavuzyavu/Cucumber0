package day32_stringBuilder;

public class C02_append_insert {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java daha ne yapsin");

// append istedigimiz String'i en sona ekler
        sb.append("?");
        System.out.println(sb);// Java daha ne yapsin?

        sb.append(true);
        System.out.println(sb);// Java daha ne yapsin?true

        sb.append(5);
        System.out.println(sb);// Java daha ne yapsin?true5


        sb.append("Java",2,4);
        System.out.println("uc parametreli append"+sb);// uc parametreli appendJava daha ne yapsin?true5va


// araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz
        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);// Java her seyi dusunmus, daha ne yapsin?true5va


        sb.insert(22,"valla valla",5,11);

        System.out.println(sb);// Java her seyi dusunmus valla, daha ne yapsin?true5va




    }
}
