package day08stringmanipulations;

public class StringMnipulations02 {

    public static void main(String[] args) {

        // Example 1 : Bir stringdeki space haric kaç tane karakter kullanıldığını gösteren kodu yazınız.
        //"Ali okula gitti " ==> 14

        String str = "Ali went to school. ";

        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ", "").length();
        System.out.println(num);

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.


        String ch = "actually want to apple";
        String yeniCh = ch.replace("a", "A");
        System.out.println(yeniCh);

        //Example 3: Bir String'deki tum "black" kelimelerinin yerine "*" koyunuz

        String bl = "black my life black my hair black I like black";
        String newBl = bl.replace("black", "*");
        System.out.println(newBl);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

        String pwd = "fhruıfzo552rthıgzo45rtfkl65785245rdjhdjft55t8uıdş5475";
        String newPwd =pwd.replaceAll("[0-9]","*");
        System.out.println(newPwd);

        String nepPwd =pwd.replaceAll("[0-9]","");
        System.out.println(nepPwd);

        /*
            Bir grup data'yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tim karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]
         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz


        String kd =  "Ali 13 yasinda, dersem inanma!...";
        int newKd= kd.replaceAll("[0-9]", "").replaceAll("[\\p{Punct}]","").replaceAll("[ ]","").length();
        System.out.println(kd +newKd);

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String sifre = "B85c? K!m";
        boolean first = sifre.replace(" " , "").length()>7;

        boolean second= sifre.replaceAll("[0-9a-zA-Z]","").length()>0;

        boolean third = sifre.replaceAll("[^0-9]","").length()>0;

        boolean forth = sifre.replaceAll("[^A-Z]" , "").length()>0;

        boolean fifth = sifre.replaceAll("[^a-z]", "").length()>0;

        boolean sifreGecerli = first&&second&&third&&forth&&fifth ;

        if (sifreGecerli){
            System.out.println("Şifreniz geçerlidir...");
        }else {
            System.out.println("Geçersiz Şifre Tekrar deneyiniz...");
        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";

        int bir = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(bir);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.

        String v = "Kalex";

        boolean bas =v.startsWith("Al");
        boolean son =v.endsWith("x");

      String ssonuc= bas&&son ? "Harika": "Normal";
        System.out.println(ssonuc);



    }




}
