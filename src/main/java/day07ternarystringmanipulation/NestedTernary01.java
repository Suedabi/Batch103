package day07ternarystringmanipulation;

public class NestedTernary01 {
    public static void main(String[] args) {

/*
Verilen yilin "Leap Year" (Artık yıl) olup olmadığını kontrol eden kodu yaziniz.
i)yıl 100 e bölünürse 400 e de bölünmelidr
ii) yil 100 e bölünmezse 4 e bölünmelidir.
 */

        int year = 1600 ;
      String leap  = year%100==0 ? (year%400==0 ? "Leap Year" : "Leap Year değil"): ( year%4==0 ?"Lep Year" : "Leap Year değil");
        System.out.println(leap);

        /*
        Aşağıdaki kurallara göre password'un gecerli olup olmadığını kontrol eden kodu yazınız.
        i) sekiz karakterden fazla veya sekiz karakter varsa ilk harfi "i" olmalıdır.
        ii) sekiz karakterden az karakter varsa ilk harfi "K" olmalıdır.
         */

        String pwd ="K2a3";

        char ilkHarf = pwd.charAt(0);

       String sifre = pwd.length()<8 ? (ilkHarf=='K'?  "Geçerli password" : "Geçersiz password"): (ilkHarf=='i'? "Geçerli password": "Geçersiz password") ;
        System.out.println(sifre);









    }

}
