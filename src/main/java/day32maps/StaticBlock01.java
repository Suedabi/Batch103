package day32maps;

public class StaticBlock01 {

    public static double pi = 3.14;

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    //static block'lar ihtiyacimiz olan variable'lari Class olusturma safasinda elimizde olmasini saglar
    //static block'lar Class icindeki her seyden once calistirilir. "main method"'dan ve diger tum method'lardan once calistirlir.
    //static bloc'lar icinde sadece "static variable"'lara deger alabilir.
    //Birden fazla "static bloc" varsa ustteki once calistirlir.

    static {
        pi = 3.14;
        System.out.println("Static block 1");


    }

}
