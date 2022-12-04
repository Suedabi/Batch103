package day07ternarystringmanipulation;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

//Example 1 : Bir sayının pozitif olup olmadığını ekrana yazdıran kodu yazınız.

        //1. way :if-else
        int a = -75;
        if (a > 0) {
            System.out.println("Pozitiftir");
        } else {
            System.out.println("Pozitif değil");
        }

        // 2. way: ternary
        //Condition dogru ise uygulanacak kod : condition yanlış ise uygulanacak kod
        String sonuc = a > 0 ? "pozitif" : "Pozitif değildir";
        System.out.println(sonuc);

//Example 2 : iki sayıdan küçük olanı seçen kodu yazınız
        int b = 23;
        int c = 23;
        int min = b < c ? b : c;
        System.out.println(min);

//Example 3: Verilen bir sayının mutlak değerini hesaplayan kodu ekrana yazdırınız.
        //   pozitif sayıların ve sıfırn mutlakdegeri kendileridir.
        //   Negaztif sayıların mutlak degeri kendisidir.(-1 ile çarp)

        int d = -45;
        int abs = d < 0 ? -1 * d : d;
        System.out.println(abs);

        // Example 4 : Iki tane sayı aynı işaretliyse bu sayılaeı çarpınız,farklı işaretliyse "Işlem yapamam diyelim"

        int e = 12;
        int f = 10;


        //Tenary farkli data tiplerinde saonuç return ederse sonucun data tipini Object yapınız.

        Object işlem = (e > 0 && f > 0) || (e < 0 && f < 0) ? e*f : "Işlem yapamam";
        System.out.println(işlem);

        //Note: Java'da her Class'ın "parent" calssı vardır.
        //Sadece "Object" class'in "parent" class'ı yoktur.



    }

}
