package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {


    public static void main(String[] args) {


       //Example 1: KUllanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız.
       //: Ramazan ==> Rn

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen ilk isminizi giriniz.");
        String isim = scan.next();

      char ilkHarf= isim.charAt(0);
      char sonHarf =isim.charAt(isim.length()-1);//Yazdiginiz code her durum icin calisirsa o code'a "Dynamic Coding" denir.

        System.out.println("İsmin ilk ve son harfi  =" + " " +ilkHarf+sonHarf  );


        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz
        //           "Ben kedi, esim tavuk, oglum sever inek"

        String str = "Ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki kullanimi vardir.
        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
        String kedi = str.substring(4, 8);
        String tavuk = str.substring(15, 20);
        String inek = str.substring(34);
        System.out.println(kedi + tavuk + inek);

        //Example 3 : Ilk isim ve soy isim içeren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz.
        //            Ali Can ==> AC
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen isminizi ve soy isminizi giriniz  :");
        String ism = input.nextLine();

        String a =ism.substring(0,1);
        String b =ism.split(" ")[1].substring(0,1);
        System.out.println(a+b);








    }


}
