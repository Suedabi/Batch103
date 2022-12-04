package day04ifstatemen;

import java.util.Scanner;

public class Scanner002 {
    //Note: char veriable'ları matematiksel işlemlerde kullanırsanız Java onları ASCII değerlerini kullanır.
    //ÖRN: System.out.pritln('A'+'C') ekrana AC yerine 132 yazdırır.
    //NOTE: Java'da "+" sembolünün iki farklı anlamı vardır . i) Toplama işlemi ile ii) birleştirme işlemi
    // Java'da "+" sembolü görünce once toplama yapmaya çalışır, yapamazssa birleştirme işlemi yapmaya calışır.o da olmassa hata verir.



    public static void main(String[] args) {

//Kullanıcıdan ilk ve soy ismini alınızilk ve soy isimlerinin ilk harflerini ekranaa yazdırınız.
// Ali Can ==> AC

        Scanner input= new Scanner(System.in);

        // 1. yol:

        //  System.out.println("Lütfen isminizi giriniz");
        // char ilk = input.next().charAt(0);

        //System.out.println("Lütfen soy isminizi giriniz");
        //char soy =input.next().charAt(0);

        //System.out.println("" +ilk+soy);

        // 2.yol:

        System.out.println("Tam isminizi giriniz ... ");
        String tamIsim= input.nextLine();

         char ilkHarf= tamIsim.charAt(0);
        System.out.println(ilkHarf);

        // char ikinciHarf = tamIsim.charAt(6);
        // System.out.println(ikinciHarf);

        //System.out.println(""+ ilkHarf+ikinciHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

        System.out.println(" "+ilkHarf+soyIsminIlkHarfi);

    }

}
